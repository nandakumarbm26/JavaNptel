package basic;

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(8,2,1);
		System.out.println(c.p.x+" "+c.p.y+" "+c.radius);
	}

}

class Circle{
	int radius;
	Point p;
	Circle(int r,int x,int y){
		p=new Point(x,y);
		radius=r;
	}
	
	public static class Point{
		int x,y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}
