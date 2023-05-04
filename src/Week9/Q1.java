package Week9;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"으로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요 >>");
		double va = scanner.nextDouble();
		double res= convert(va);
		
		System.out.println("변환 결과: "+res+getDestString()+"입니다.");
		//scanner.close();
	}
}

class Won2Dollar extends Converter{
	private double won;
	protected double ratio = 1200;
	
	public Won2Dollar(double won) {this.won =won;}
	
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
	
}

class Km2Mile extends Converter{
	private double km;
	protected double ratio =1.6;
	public Km2Mile(double won) {this.km =km;}
	
	protected double convert(double src) {
		return src/ratio;
	}
	protected String getSrcString() {
		return "킬로미터";
	}
	protected String getDestString() {
		return "마일";
	}
}

public class Q1 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();

	}

}
