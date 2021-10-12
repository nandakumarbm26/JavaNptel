package multThreading;

public class MultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA A=new ThreadA();
		ThreadB B=new ThreadB();
		ThreadC C=new ThreadC();
		B.start();
		A.start();
		
		C.start();
		System.out.println("MultiThreading is complete..");
	}

}

class ThreadA extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("From thread A with i= "+ -1*i);
		}
		System.out.println("Exiting from Thread A...");
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From thread B with i= "+ 2*i);
		}
		System.out.println("Exiting from Thread B...");
	}
}

class ThreadC extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From thread C with i= "+ (2*i-1));
		}
		System.out.println("Exiting from Thread C...");
	}
}