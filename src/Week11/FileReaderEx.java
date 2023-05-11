/*
 * FileReader로 텍스트 파일 읽기
 */
package Week11;
import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
	 FileReader fin = null;
	 try {
		fin = new FileReader("c:\\windows\\system.ini");
		int c;
		while((c=fin.read())!=-1)			// 한 문자씩 파일 끝까지 읽기
			System.out.print((char)c);	
		fin.close();
	 	} 
	 catch (FileNotFoundException e) {		// FileNotFound는 IOException을 상속 받으므로 생략 가능
		System.out.println("파일을 열 수 없음");
	 }
	 catch(IOException e) {
		 System.out.println("입출력 오류");
	 }
	 
	}
}
