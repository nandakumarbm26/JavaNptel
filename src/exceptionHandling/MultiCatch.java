package exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		try{
			int i=args.length;
			String myString[]=new String[i];
			if(args[10].equals("Java")) {
				System.out.println("Dirst word is Java");
			}
			System.out.println("number of arguments="+i);
			int x=12/i;
			int y[]= {555,999};
			y[i]=x;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.fillInStackTrace());
			System.out.println(e.getCause());
		}
	}

}
