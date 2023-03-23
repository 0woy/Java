/*
 프로그램 설명: 양수 A와 B를 입력 받아 1부터 b까지의 수 중에서 a의 수를 
 모두 더한 값 출력
 */
package Week4;
import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("양수 a, b를 입력하세요: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum=0,n=1;
		while(n*a <=b) {
			sum += (n++)*a;
		}
		System.out.println(a+"부터 "+b+"까지의 수 중 "+a+"배수의 합은 "+sum );

	}

}
