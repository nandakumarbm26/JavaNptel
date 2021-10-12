package multThreading;
public class Priority {
	public static void main(String[] args) {
		ThreadA t=new ThreadA();
		ThreadB t2=new ThreadB();
		ThreadC t3=new ThreadC();
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority( t3.getPriority()+1);
		t.start();
		t2.start();
		t3.start();
		System.out.println("END.......");
	}
}
