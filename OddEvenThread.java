import java.util.Random;

class NumberManager1{
	private int generatedNumber;
	private boolean numberGenerated = false;
	public synchronized void generateNumber(){
		generatedNumber = new Random().nextInt(99)+2;
		System.out.println("Generated Random Number : "+generatedNumber);
		numberGenerated = true;
		notifyAll();
	}
	public synchronized void printEvenSquare() throws InterruptedException {
		while(!numberGenerated||generatedNumber%2!=0) {
			wait();
		}
		
		System.out.println("The square is :"+(generatedNumber*generatedNumber));
		
		numberGenerated = false;
	}
	public synchronized void printOddCube() throws InterruptedException {
		while(!numberGenerated||generatedNumber%2==0) {
			wait();
		}
		System.out.println("The cube is :"+(generatedNumber*generatedNumber*generatedNumber));
		numberGenerated = false;
	}
}
class NumberGenerator1 extends Thread{
	NumberManager1 manager;
	public NumberGenerator1(NumberManager1 manager) {
		this.manager = manager;
	}
	public void run() {
		while(true) {
			manager.generateNumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class EvenPrinterThread1 extends Thread{
	NumberManager1 NumberManager1;
	public EvenPrinterThread1(NumberManager1 NumberManager1) {
		this.NumberManager1 = NumberManager1;
	}
	public void run() {
		while(true) {  //infinite loop to access and print even numbers...
			try {
				NumberManager1.printEvenSquare();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddPrinterThread1 extends Thread{
	NumberManager1 NumberManager1;
	public OddPrinterThread1(NumberManager1 NumberManager1) {
		this.NumberManager1 = NumberManager1;
	}
	public void run() {
		while(true) { 
			try {
				NumberManager1.printOddCube();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class OddEvenThread {

	public static void main(String[] args) {
		NumberManager1 manager = new NumberManager1();
		NumberGenerator1 NumberGenerator1 = new NumberGenerator1(manager);
		EvenPrinterThread1 EvenPrinterThread1 = new EvenPrinterThread1(manager);
		OddPrinterThread1 OddPrinterThread1 = new OddPrinterThread1(manager);
		NumberGenerator1.start();
		EvenPrinterThread1.start();
		OddPrinterThread1.start();
	}

}
