package packages_interface;

public class ShapeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(20);
		c.area();
		c.perimeter();
	}

}
class Circle implements Shape{
	private int radius;
	Circle(int r){
		radius=r;
	}
	@Override
	public void perimeter() {
		System.out.println("perimeter= "+(Pi*2*radius));
		
	}

	@Override
	public void area() {
		System.out.println("Area"+(Pi*radius*radius));
		
	}
	
}
