/*
 * 배열의 크기를 main()의 매개변수로 받아와 실수 배열을 생성
 * 실수 0~100 사이의 난수를 저장한 다음 버블정렬 알고리즘을 사용하여
 * 정렬하여 출력
 */

package Week6;
import java.util.Random;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[]= new double[Integer.parseInt(args[0])];
		Random random = new Random();
		System.out.print("정렬전: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= random.nextDouble(101);
			System.out.printf("%2.2f", arr[i]);
		}
		
	}

}
