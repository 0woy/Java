/*
 * 두 행렬의 크기를 사용자로부터 입력 받아 
 * 행렬을 생성한 다음 0부터 10까지 난수를 저장하고,
 * 두 행렬의 덧셈과 뺄셈을 수행하는 코드 작성
 * (행렬의 덧셈,뺄셈 연산은 행렬의 크기가 같아야 함)
 */
package Week6;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int n, m, a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 행렬의 크기 >> ");
		n = scanner.nextInt();
		m = scanner.nextInt();
		a = scanner.nextInt();
		b = scanner.nextInt();
		int[][] A = new int[n][m];
		int[][] B = new int[a][b];
		int rand[] = new int[n * m * 2];
		
		for (int i = 0; i < n * m * 2; i++) {
			rand[i] = ran.nextInt(11);
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = rand[i * 5 + j];
				B[i][j] = rand[i * 5 + 15 + j];
			}
		}

		System.out.println("-- A 행렬 --");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-- B 행렬 --");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-- A+B--");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int x = A[i][j];
				int y = B[i][j];
				
				System.out.print((x+y)+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
