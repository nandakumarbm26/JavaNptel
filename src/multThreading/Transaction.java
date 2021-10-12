package multThreading;
//Credit = withdraw
//debit = ADDBALANCE


public class Transaction {

	public static void main(String[] args) {
		BankAccount A=new BankAccount("NandaKumar");
		Trans t1=new Trans(2,3000,A);
		Trans t2=new Trans(1,3000,A);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println(A.getBal());
	}

}

class Debit{
	public void debit(int amount, BankAccount Acc) {
		try {
			Thread.sleep(100);
			Acc.setBal(amount+Acc.getBal());
			
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
		System.out.println(amount+" is debitted to A/c- "+Acc.getName());
	}
}

class Credit{
	public void credit(int amount, BankAccount Acc) {
		try {
			Thread.sleep(5000);
			if(Acc.getBal()>(amount+500)) {
				Acc.setBal(Acc.getBal()-amount);
				System.out.println(amount+" is Credited to A/c- "+Acc.getName());
			}
			else {
				System.out.println("Insufficient Balance Transaction Not Possible");
			}
			
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
	}
}

class Trans extends Thread{
	Credit c=new Credit();
	Debit d=new Debit();
	int OPt,amount;
	BankAccount Acc;
	Trans(int ch,int amount,BankAccount Acc){
		OPt=ch;
		this.amount=amount;
		this.Acc=Acc;
	}
	public void run() {
		synchronized (Acc){
		try {
			switch(OPt) {
				case 1:c.credit(amount, Acc);break;
				case 2:d.debit(amount, Acc);break;
			}
		}
		
		catch(Exception e) {
			System.out.println("Interrupted");
		}
		}
	}
}

class BankAccount{
	public static final int _START_BAL=500;
	private int AccBal;
	private String Name;
	
	public int getBal() {
		return AccBal;
	}
	
	public void setBal(int AccBal) {
		this.AccBal=AccBal;
	}
	
	BankAccount(String name){
		setName(name);
		AccBal=_START_BAL;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
}


