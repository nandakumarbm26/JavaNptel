package multThreading;

public class ThreadID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			Thread t=new Thread(new TID());
			t.start();
		}
	}

}
class TID implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<10000000;i++);
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
			for(int i=0;i<1000;i++);
		}
		catch(Exception e) {
			System.out.println("Exception was caught");
		}
	}
	
}
