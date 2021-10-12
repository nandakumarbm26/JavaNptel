package inheritance;

public class Overridingg {
	public static void main(String[] args) {
		B b=new B();
		b.display(10);
	}
}

class A{
	public int display(int w) {
		System.out.println("20");
		return 20;
	}
}

class B extends A{
	public int display(int w) {
		System.out.println("20");
		return w;
	}
}
