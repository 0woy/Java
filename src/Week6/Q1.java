/*
 * 과목과 점수가 짝을 이루도록 2개의 배열 작성
 * 과목 이름을 입력 받아 점수를 출력하는 프로그램 작성
 * "그만" 이라고 입력 받으면 종료한다.
 */
package Week6;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String course[] = { "java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		while (true) {
			System.out.print("과목 이름>> ");
			String n = scanner.next();
			if (n.equals("그만"))
				break;

			int idx = Arrays.asList(course).indexOf(n);
			if (idx == -1)
				System.out.println("없는 과목입니다.");
			else {
				System.out.println(n + "의 점수는 " + score[idx] + "입니다.");
			}
		}

		scanner.close();
	}
}
