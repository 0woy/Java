package Week7;

import java.util.Scanner;

class Circle_{
	double x,y;
	int radius;
	public Circle_(double x, double y, int r) {
		this.x =x;
		this.y=y;
		this.radius=r;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}
public class CircleManager {

	public static void main(String[] args) {
		Circle_[] circles = new Circle_[3];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<circles.length;i++) {
			System.out.print("x, y, radius >>");
			double x=  scanner.nextDouble();
			double y= scanner.nextDouble();
			int radius = scanner.nextInt();
			circles[i]= new Circle_(x, y, radius);
		}
		for(int i=0;i<circles.length;i++)
			circles[i].show();
		
		
				

	}

}
