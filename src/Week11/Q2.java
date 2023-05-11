package Week11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


class Phone{
	private String name;
	private String p_number;
	Phone(String name, String phone){
		this.name =name;
		this.p_number = phone;
	}
	public String getName() {
		return name;
	}
	public void getUser() {
		System.out.println(name+"님의 전화번호는 "+p_number+"입니다.");
	}
}

public class Q2 {

	public static void main(String[] args) {
		Phone [] people = new Phone[3];
		Scanner scanner = new Scanner(System.in);
		FileWriter fout =null;
		FileReader fin = null;
		
		try {
			fout = new FileWriter("C:\\Java_workspace\\Java_Practice\\src"
					+ "\\Week11\\phone.txt");
			while(true) {
				String line = scanner.nextLine();
				if(line.equals("그만")) break;
				fout.write(line);
				fout.write("\r\n");
			}
			fout.close();
			System.out.println("phone.txt에 저장하였습니다.");
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
		// 파일 읽어오기
		System.out.println("phone.txt를 출력합니다.");
		try {
			fin = new FileReader("C:\\Java_workspace\\Java_Practice\\src"
					+ "\\Week11\\phone.txt");
			int c,i=0;
			String tmp ="";
			
			// 파일을 읽어와서 Phone 클래스에 정보 추가
			while((c=fin.read())!=-1){
				System.out.print((char)c);
				tmp +=(char)c;
				if((char)c=='\n') {
					tmp = tmp.replaceAll(System.getProperty("line.separator"), "");
					StringTokenizer st = new StringTokenizer(tmp," ");
					people[i++] = new Phone(st.nextToken(), st.nextToken());
					tmp="";
				}
			}
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		
		// 이름을 입력 받아 해당 사람의 전화번호 검색 및 출력
		System.out.println("phone.txt를 읽어옵니다.");
		while(true) {
			String find;
			System.out.print("이름>> ");
			find = scanner.next();
			if(find.equals("그만")) break;
			int i;
			for(i=0;i<3;i++) {
				if(find.equals(people[i].getName())){
					people[i].getUser();
					break;
				}
			}
			if(i==3) 
				System.out.println("없는 전화번호 입니다.");
		}
		scanner.close();
	}

}
