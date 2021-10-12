package basic;

public class StaticDemo {

	public static void main(String[] args) {
		StaticMethod.hello();

	}

}

class StaticMethod{
	static void hello() {
		System.out.println("Hello,world Static");
	}
	
}
