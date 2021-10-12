package multThreading;

public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Thread1A());
		Thread t2=new Thread(new Thread1B());
		Thread t3=new Thread(new Thread1C());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("OVER");
	}

}

class Thread1A implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("From thread A with i= "+ -1*i+ " "+Thread.currentThread().getId());
		}
		System.out.println("Exiting from Thread A...");
	}
}

class Thread1B implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From thread B with i= "+ 2*i+ " "+Thread.currentThread().getId());
		}
		System.out.println("Exiting from Thread B...");
	}
}

 class Thread1C implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From thread C with i= "+ (2*i-1)+ " "+Thread.currentThread().getId());
		}
		System.out.println("Exiting from Thread C...");
	}
 }
