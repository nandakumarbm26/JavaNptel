package inheritance;
class Car{
	protected int i=100;
	void display() {
		System.out.println("I am Car"+i);
	}
}
class Innova {
	void display() {
		System.out.println("I am Innova");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		Car c=new Car();
		c.display();
	}
	
}


