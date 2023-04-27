package Week8;

class Person_{
	public void print() {	System.out.println("Person");}
	
}
class Student_ extends Person_{
	public void print() {
		System.out.println("Student");
	}
	public void printGrade() {System.out.println("학점: 3.5");}
}

class Reasearcher extends Person_{
	public void print() {System.out.println("Reasearcher");}
}

class Professor extends Person_{
	public void print() {System.out.println("Professor");}
}

public class Upcasting {

	public static void main(String[] args) {
		Person_ p = new Reasearcher();
		p.print();
		
		p = new Professor();
		p.print();
		
		p= new Student_();
		p.print();
		//p.printGrade();

		// 다운 캐스팅
		Student_ s =  (Student_)p;
		s.printGrade();

	}

}
