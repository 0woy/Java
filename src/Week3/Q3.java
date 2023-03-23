package Week3;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요 >> ");
		int price = scanner.nextInt();
		int[]arr= new int[8]; //1 10 50 100 500 1000 10000 50000
		String [] name= {"오만원권","만원권","천원권","오백원","백원","오십원","십원","일원"}; 
		int [] money= {50000,10000,1000,500,100,50,10};
		
		for(int i=0;i<8;i++) {
			if(i==7) arr[i]=price;
			else {
			arr[i] = price / money[i];
			price %=money[i];
			}
		}		
		for(int i=0;i<8;i++) {
		if(arr[i]!=0) 
			System.out.println(name[i]+" "+arr[i]+(i<3?"매":"개"));
		}
		
	}

}
