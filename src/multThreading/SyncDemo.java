package multThreading;
public class SyncDemo {

	public static void main(String[] args) {
		Sender snd=new Sender();
		SyncSend s1=new SyncSend("hello",snd);
		SyncSend s2=new SyncSend("World",snd);
		s1.start();
		s2.start();
		try {
			s1.join();
			s2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
	}

}
class Sender{
	public void send(String msg) {
		System.out.println("Sending\t"+msg);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("\n"+msg+" Sent");
	}
}
class SyncSend extends Thread{
	private String msg;
	Sender sender;
	SyncSend(String m,Sender obj){
		msg=m;
		sender=obj;
	}
	
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
		
	}
}