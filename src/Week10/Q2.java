package Week10;
import java.util.Calendar;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month= now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜:"+year+"년 "+month+"월 "+day+"일");

		Calendar birth = Calendar.getInstance();
		birth.clear();
		System.out.print("생년월일>> ");
		int by = scanner.nextInt();
		int bm = scanner.nextInt();
		int bd = scanner.nextInt();
		
		birth.set(by,bm,bd);
		by = birth.get(Calendar.YEAR);
		bm= birth.get(Calendar.MONTH);
		bd = birth.get(Calendar.DAY_OF_MONTH);
		
		int yage = now.get(Calendar.YEAR)-birth.get(Calendar.YEAR);
		System.out.println("연 나이: "+yage);
		
		if(bm*100+bd > month*100+day)
			yage-=1;
		System.out.println("만 나이: "+yage);
	}

}
