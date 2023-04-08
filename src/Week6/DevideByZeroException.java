/*
 * try-catch 블록을 이용하여 정수를 0으로 나누는 경우에 "0으로 나눌 수 없음"을 출력
 * 다시 입력 받는 프로그램 작성
 */
package Week6;
import java.util.*;
public class DevideByZeroException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("나뉨 수를 입력하세요: ");
			int dividend = scanner.nextInt();
			System.out.print("나눗수를 입력하세요: ");
			int divisor = scanner.nextInt();
			
			try {
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
				break;
			}
			
			// 오류가 발생했을 때 Ctrl+1 하면 추천 단어 생성
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.! 다시 입력하세요");
			}
		}
		scanner.close();
	}

}
