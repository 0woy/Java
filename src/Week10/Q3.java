package Week10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Student_{
	private double avg;
	private String name;
	private String major;
	private int id;

	public Student_(String name, String major, int id, double avg){
		this.name=name;
		this.major=major;
		this.id=id;
		this.avg = avg;
	}
	public void print() {
		System.out.println("----------------------------------------");
		System.out.println("이름:"+name);
		System.out.println("학과:"+major);
		System.out.println("학번:"+id);
		System.out.println("학점평균:"+avg);
	}
	public void printPerson() {
		System.out.println(name+", "+major+", "+id+", "+avg);
	}
	public String getName() {return name;}
	
}
public class Q3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in); 
		ArrayList<Student_> std = new ArrayList<Student_>();
		System.out.println("학생 이름, 학과, 학번 학점 평균을 입력하세요.");
		for(int i=0;i<4;i++) {
			String str = scanner.nextLine();
			StringTokenizer st= new StringTokenizer(str," ");
			Student_ tmp = new Student_(st.nextToken(), st.nextToken(),
					Integer.parseInt(st.nextToken()), Double.parseDouble(st.nextToken()));
			std.add(tmp);
		}
		for(int i=0;i<std.size();i++) {
			std.get(i).print();
		}
		
		while(true) {
			System.out.print("학생 이름>> ");
			String find = scanner.next();
			if(find.equals("그만")) break;
			for(int i =0;i<std.size();i++)
				if(find.equals(std.get(i).getName()))
						std.get(i).printPerson();
		}
		scanner.close();
	}

}
