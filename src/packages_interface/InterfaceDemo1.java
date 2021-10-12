package packages_interface;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		anInterface a;
		a=new Demo();  //runTimePolyMorphism
		a.display();
	}

	

}
class Demo implements anInterface{
	@Override
	public void display() {
		System.out.println("Hello,World!");
		
	}
}

abstract class C{
	
}
