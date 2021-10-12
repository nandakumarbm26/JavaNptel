package basic;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		do {
			System.out.print(" "+2*count);
			count++;
		}while(count<11);
		System.out.println();
		for(int i=0;i<11;i++) {
			System.out.println(" count ="+i);
		}
		
		for(int i=0;i<11;i++) {
			System.out.println(" count ="+i);
			if(i%2==0) continue;
			System.out.println("hello im false");
		}
		
		for(int i=0;i<11;i++) {
			System.out.println(" count ="+i);
			if(i==5) break;
			System.out.println("hello im false");
		}
			
	}

}
