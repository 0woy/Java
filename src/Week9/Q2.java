package Week9;
import Restaurant.Restaurant;

import java.util.Scanner;

import Restaurant.PizzaRestaurant;
public class Q2 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		Restaurant r = new PizzaRestaurant();
		
		System.out.println(r.getName()+"에 방문해 주셔서 감사합니다.");
		System.out.println("무엇을 구매하시겠습니까?");
		r.printMenus();
		
		System.out.print("구매할 음식>>");
		String food = scanner.nextLine();
		r.buyFood(food);
		
		scanner.close();

	}

}
