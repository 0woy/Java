package Week8;

class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(0, 0);
		color="Black";
	}
	public ColorPoint(int x, int y) {super(x, y);}
	public void setXY(int x, int y) {move(x, y);}
	public void setColor(String color) {this.color = color;}
	public String toString() {
		return this.color+"색의 ("+getx()+", "+gety()+")의 점";
	}
}

class Point3D extends Point{
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z=z;
	}
	
	public String toString() {return "("+getx()+", "+gety()+", "+this.z+")의 점";}
	public void moveUp() {	this.z+=1;}
	public void moveDown() {this.z-=1;}
	public void move(int x, int y, int z) {
		move(x, y);
		this.z =z;
	}	
}

class PositivePoint extends Point{
	public PositivePoint() {super(0, 0);}
	public PositivePoint(int x, int y) {super((x<0)?0:x,(y<0)?0:y);}
	
	public String toString() {return "("+getx()+", "+gety()+")의 점";}

	public void move(int x, int y) {
		if(!(x<0 |y<0))
			super.move(x, y);
	}	
}
	
public class Q3 {

	public static void main(String[] args) {
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"입니다.");
		
		ColorPoint cPoint = new ColorPoint(10,10);
		cPoint.setXY(5,5);
		cPoint.setColor("RED");
		System.out.println(cPoint.toString()+"입니다.");
		
		System.out.println();
		
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		p.moveUp();
		System.out.println(p.toString()+"입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100, 200,300);
		System.out.println(p.toString()+"입니다.");
		
		System.out.println();
		PositivePoint pp = new PositivePoint();
		pp.move(10,10);
		System.out.println(pp.toString()+"입니다.");
		
		pp.move(-5,5);
		System.out.println(pp.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다.");
		
}

}
