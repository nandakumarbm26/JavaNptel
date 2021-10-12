package basic;

public class IntCLA {

	public static void main(String[] args) {
		int j;
		int sum=0;
		for(int i=0;i<args.length;i++) {
			j=Integer.parseInt(args[i]);
			System.out.print(j+" ");
			sum+=j;
		}
		System.out.println("\n"+sum);
		System.exit(0);

	}

}
