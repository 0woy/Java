package Week1;
import java.util.Random;
import java.util.Scanner;
public class Ran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위:0, 바위:1, 보:2 를 입력하세요: ");
		int user = scanner.nextInt();
	
		int com = ran.nextInt(3);
		
		if(com == user)
			System.out.print("비겼네요");
		else {
			if(com == 0) {
				System.out.println("computer: 가위");
				if(user ==1) System.out.print("사용자가 이겼네요");
				else System.out.print("사용자가 졌네요");
			}
			else if(com ==1) {
				System.out.println("computer: 바위");
				if(user ==2) System.out.print("사용자가 이겼네요");
				else System.out.print("사용자가 졌네요");
			}
			else {
				System.out.println("computer: 보");
				if(user ==0) System.out.print("사용자가 이겼네요");
				else System.out.print("사용자가 졌네요");
			}
		}
		scanner.close();
	}
}
