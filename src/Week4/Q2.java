package Week4;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("양수를 입력하세요>> ");
		int n = scanner.nextInt();
	
		for(int i=1;i<=n*2;i++) {
			if(i>n) {
				for(int k=0;k<i-n;k++) System.out.print(" ");
				for(int j=0;j<(n*2-i)*2;j++)
					System.out.print("*");
			}
			else {
			for(int k=0;k<n-i;k++) System.out.print(" ");
			for(int j=0;j<i*2;j++)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
