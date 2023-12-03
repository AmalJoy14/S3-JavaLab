import java.util.Scanner;

class MultiplicationTable{
	synchronized void multiplication(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}
}

class Thread1 extends Thread{
	MultiplicationTable m;
	int digit;
	Thread1(MultiplicationTable m,int digit){
		this.m=m;
		this.digit=digit;
	}
	public void run() {
	m.multiplication(digit);
	}
}

class Thread2 extends Thread{
	MultiplicationTable m;
	int digit;
	Thread2(MultiplicationTable m,int digit){
		this.m=m;
		this.digit=digit;
	}
	public void run() {
	m.multiplication(digit);
	}
}

class Thread3 extends Thread{
	MultiplicationTable m;
	int digit;
	Thread3(MultiplicationTable m,int digit){
		this.m=m;
		this.digit=digit;
	}
	public void run() {
	m.multiplication(digit);
	}
}

public class MultiplicatioTableThread {
    public static void main(String [] args) {
    	Scanner sc=new Scanner(System.in);
    	MultiplicationTable mtable=new MultiplicationTable();
    	int number;
    	
    	System.out.println("Enter the Table that you want to run by thread1:");
	number =sc.nextInt();
	Thread1 thread1=new Thread1(mtable,number);
	
	System.out.println("Enter the Table that you want to run by thread2:");   
	number =sc.nextInt();
	Thread2 thread2=new Thread2(mtable,number);
		
	System.out.println("Enter the Table that you want to run by thread3:");
	number =sc.nextInt();
	Thread3 thread3=new Thread3(mtable,number);
		
	sc.close();
	thread1.start();
	thread2.start();
	thread3.start();		
    }
}
