/*
 0~100까지 컴퓨터의 난수 N 선택
 사용자로부터 0~100까지 정수 중 1개를 입력 받아 다음 수행
 - 숫자 N보다 큰 경우 DOWN
 - 숫자 N보다 작은 경우 UP
 - N과 같은 경우 !!성공!! 입력횟수: COUNT 출력
 */
package Week4;
import java.util.Random;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Random ran = new Random();
		int com =ran.nextInt(101);
		
		int user = -1;
		int count =0;
		
		System.out.println(com);
		while(com!=user) {
			System.out.print("정수 입력>>");
			user = scanner.nextInt();
			if(user>com) System.out.println("DOWN");
			else if(user<com) System.out.println("UP");
			count++;
		}
		System.out.println("!!성공!! (입력횟수:"+count+")");
	}

}
