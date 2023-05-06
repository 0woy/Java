package Week10;

import java.util.StringTokenizer;

class StrToStudent{
	public String name;
	public String lecture;
	public String grade;
	
	public StrToStudent(String name, String lecture, String grade) {
		this.name=name;
		this.lecture=lecture;
		this.grade=grade;
	}
}

public class Q1 {

	public static void main(String[] args) {
		StrToStudent[] list = new StrToStudent[3];
		String str ="가나다,python 프로그래밍,A;나다라,Java 프로그래밍,B;다라마,C 프로그래밍,C;";
		StringTokenizer st1 = new StringTokenizer(str,";");
		int i=0;
		String name, lecture,grade;
		while(st1.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st1.nextToken(),",");
				name = st2.nextToken();
				lecture= st2.nextToken();
				grade=st2.nextToken();
				
				list[i++] = new StrToStudent(name, lecture, grade);
		}
		
		for (StrToStudent student:list) 
			System.out.println(student.name+"는 "+student.lecture+
					" 과목에서 "+student.grade+"점을 받았다.");
		
	}

}
