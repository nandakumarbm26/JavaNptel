package basic;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial of 5 = "+Fact(5));
		System.out.println("10th Fibboncci number = "+Fib(10));
		System.out.println(gcd(10,5));
		System.out.println(gcd(5,10));
		System.out.println(gcd(14,59));
	}
	public static int Fact(int n) {
		if(n==0)
			return 1;
		else
			return n*Fact(n-1);
	}
	
	public static int Fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		else {
			return Fib(n-1)+Fib(n-2);
		}
	}
	
	public static int gcd(int m,int n) {
		if(m>n) {
			if(n==0)
				return m;
			else
				return gcd(n,m%n);
		}
		else
			if(m==0)
				return n;
			else
				return gcd(m,n%m);
		}
	}

