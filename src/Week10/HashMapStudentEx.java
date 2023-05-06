/*
 * 제네릭 컬렉션 활용 - HashMap<K,V> 예제
 * 객체 저장 및 학생정보 관리
 */
package Week10;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private int id;
	private String telString;
	public Student(int id, String tel) {this.id=id; this.telString=tel;}
	public int getId() { return id;}
	public String getTel() { return telString;}
}

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String,Student>();
		map.put("황기태", new Student(1, "010-1111-1111"));
		map.put("이재문", new Student(2, "010-2222-2222"));
		map.put("김남용", new Student(3, "010-3333-3333"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름?");
			String name = scanner.next();
			if(name.equals("exit"))
				break;
			Student std = map.get(name);
			if(std==null) System.out.println(name+"은 없는 사람 입니다.");
			else System.out.println("id: "+std.getId()+", 전화:"+std.getTel());
		}
		scanner.close();
	}

}
