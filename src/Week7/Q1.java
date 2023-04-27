package Week7;

class TV{
	String company;
	int year;
	int inch;
	public TV(String com, int y, int i) {
		this.company=com;
		this.year=y;
		this.inch=i;
	}
	public void show() {
		System.out.println(company+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	
}
public class Q1 {
	public static void main(String[] args) {
		TV myTv = new TV("LG",2017,32);
		myTv.show();

	}

}
