package Week7;

import java.util.Scanner;

class Player{
	String name;
	String sayWord;
	
	public Player(String name){
		this.name=name;
	}
	public String say() {
		System.out.print(name+">>");
		Scanner sc = new Scanner(System.in);
		sayWord = sc.next();
		return sayWord;
	}
	public boolean check(String lastwords) {
		if(lastwords.charAt(lastwords.length()-1) != sayWord.charAt(0)) {
			System.out.println(name+"이 졌습니다.");
			return false;
		}
		else return true; 
	}
	
}
public class WordGameApp {

	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
		int num = scanner.nextInt();
		
		Player[] players = new Player[num];
		for(int i=0;i<players.length;i++) {
			
			System.out.print("참가자의 이름을 입력하세요>> ");
			String name = scanner.next();
			players[i] = new Player(name);
		}
		System.out.println("시작하는 단어는 아버지입니다.");
		int i=0;
		String lastword= "아버지";
		while(true) {
			String word = players[i%players.length].say();
			if(!players[i%players.length].check(lastword)) break;	
			lastword = word;
			i++;
		}
		
		
	}

}
