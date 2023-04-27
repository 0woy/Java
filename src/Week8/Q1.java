package Week8;

import java.util.Scanner;

class MyCircle{
	public static double pi =3.14;
	public static double CircleArea(int r) {return pi*r*r;}
	
}
public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름>>");
		
		int r = scanner.nextInt();
		
		System.out.println("원주율: "+MyCircle.pi);
		System.out.println("넓이: "+MyCircle.CircleArea(r));
		
		scanner.close();
	}

}
