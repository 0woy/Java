package Week4;
import java.util.Scanner;
public class WhileSample {
	static void Whilefunc(Scanner scanner) {
		int count =0;
		int sum =0;
		int max, min;
		int n= scanner.nextInt();
		max=min=n;
		while(n!=-1) {
			sum+=n;
			count++;
			System.out.print("다음 정수 입력: ");
			n=scanner.nextInt();
			if(n>max && n!=-1) max =n;
			if(n<min && n!=-1) min =n;
		}
		if(count ==0) System.out.println("입력된 수가 없습니다.");
		System.out.println("정수의 개수는 "+count+"개이며, 평균은"+(double)sum/count+"입니다." );
		System.out.println("최댓값은 "+max+"이고, 최솟값은 "+min+"입니다.");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요: ");
		Whilefunc(scanner);
	}

}
