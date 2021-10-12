package exceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
		}catch(Exception e) {}
		int result=devideFunction(a,b);
		System.out.println(result);
		
		
		
	}
	
	static int devideFunction(int a,int b) {
		int c=0;
		try{
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		return c;
	}

}
