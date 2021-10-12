package inheritance;

public class Point {

	public static void main(String[] args) {
		ThreeDPoint p1=new ThreeDPoint(1,2,3);
		System.out.println(p1);
	}

}

class TwoDPoint{
	int x;
	int y;
	TwoDPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class ThreeDPoint extends TwoDPoint{
	int z;
	ThreeDPoint(int x,int y,int z){
		super(x, y);
		this.z=z;
	}
	@Override
	public String toString(){
		return "("+x+","+y+","+z+")";
	}
}
