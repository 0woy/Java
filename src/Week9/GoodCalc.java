package Week9;

abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int []a);
	public static void printCalc(Calculator c) {
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2,3,4}));
	}
}

public class GoodCalc extends Calculator{
	public int add(int a, int b) {return a+b;}
	public int subtract(int a,int b) {return a-b;}
	public double average(int [] a) {
		double sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum/a.length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc gCalc = new GoodCalc();
		System.out.println(gCalc.add(2, 3));
		System.out.println(gCalc.subtract(2, 3));
		System.out.println(gCalc.average(new int [] {2,3,4}));
		
		Calculator calculator = new GoodCalc();
		printCalc(calculator);		
	}

}
