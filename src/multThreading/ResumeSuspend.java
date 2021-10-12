package multThreading;

public class ResumeSuspend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread3A first =new Thread3A();
			Thread3B second=new Thread3B();
			first.start();
			second.start();
			System.out.println("Resume thread3B second");
			second.resume();
			
			System.out.println("sleep for 10 seconds..");
			Thread.sleep(10000);
			System.out.println("Wake up second thread");
		}
		catch(Exception e) {}
	}

}
class Thread3A extends Thread{
	public void run() {
		try {
			System.out.println("First Thread starts running");
			sleep(1000);
			System.out.println("First Thread finishes running");
		}
		catch(Exception e) {}
	}
}

class Thread3B extends Thread{
	public void run() {
		try(){
			System.out.println("Second Thread starts running");
			System.out.println("Second thread is suspended itself");
			suspend();
			System.out.println("Second thread runs again");
			
		}
		catch(Exception e) {}
	}
}