package Restaurant;

public class PizzaRestaurant implements Restaurant {
	
	public String menuString [] = {"불고기 피자","치즈 피자","페퍼로니 피자","고구마 피자" };
	public String getName() {
		return "수제피자";
	}
	public void printMenus() {
		for(int i=0;i<menuString.length;i++) {
			System.out.println(menuString[i]);
		}
	}
	public void buyFood(String menu) {
		int i=0;
		for(i=0;i<menuString.length;i++) {
			if(menu.equals(menuString[i])) { 
				System.out.println(menu+"를 구매하셨습니다.");
				break;
			}
			
		}
		if(i==menuString.length)
			System.out.println("없는 음식입니다.");
		
	}

}
