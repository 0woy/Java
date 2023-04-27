package Week8;
class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {this.weight=weight;}
	public int getWeight() {return this.weight;}
}

class Student extends Person{
	public void set() {
		age =30;
		name = "홍길동";
		height =175;
		setWeight(99);
	}
	public void print() {
		System.out.println("이름:"+name+"\n나이:"+age+"\n키: "+height+"\n몸무게: "+getWeight());
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		s.print();

	}

}
