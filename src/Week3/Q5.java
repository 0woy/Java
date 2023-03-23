package Week3;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int [] nums = new int [3];
		System.out.print("정수 3개를 입력하십시오>>");
		int idx = 0,max =0;
		for(int i=0;i<3;i++) {
			nums[i] = scanner.nextInt();
			if(max < nums[i]) {
				max = nums[i];
				idx =i;
			}
			
		}
		int sum = nums[(idx+1)%3]+ nums[(idx+2)%3];
		if(sum > max) System.out.println("삼각형이 됩니다.");
		else System.out.println("삼각형이 되지 않습니다.");
		
	}

}
