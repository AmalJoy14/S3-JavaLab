class MultiplicationTable{
	synchronized void multiplication(int num) {		
			for (int i=1;i<=10;i++) {
				System.out.println(num+" X "+i+" = "+i*num);
			}		
	}
}

class MyThread1 extends Thread{
	MultiplicationTable m;
	public MyThread1(MultiplicationTable m) {
		this.m=m;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		m.multiplication(5);
	}
}

class MyThread2 extends Thread{
	MultiplicationTable m2;
	public MyThread2(MultiplicationTable m2) {
		this.m2=m2;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		m2.multiplication(7);
	}
}

public class SynchronizationDemo {
	 public static void main(String [] args) {
		 MultiplicationTable table= new MultiplicationTable();
		 MyThread1 thread1=new MyThread1(table);
		 MyThread2 thread2=new MyThread2(table);
		 thread2.setPriority(10);
		 thread1.start();
		 thread2.start();
	 }
}
