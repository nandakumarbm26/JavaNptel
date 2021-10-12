package multThreading;

public class SleepStop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2A A=new Thread2A();
		Thread2B B=new Thread2B();
		Thread2C C=new Thread2C();
		B.start();
		A.start();
		
		C.start();
		System.out.println("MultiThreading is complete..");
	}

}

class Thread2A extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("From thread A with i= "+ -1*i);
		}
		System.out.println("Exiting from Thread A...");
	}
}

class Thread2B extends Thread{
	
	
	@SuppressWarnings("deprecation")
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("From thread B with i= "+ 2*i);
			if(i==2)
				stop();
		}
		System.out.println("Exiting from Thread B...");
	}
}

class Thread2C extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("From thread C with i= " + (2 * i - 1));
			if (i == 3)
				try {
					sleep(1000);
				} catch (Exception e) {
				}
		}
		System.out.println("Exiting from Thread C...");
	}
}
