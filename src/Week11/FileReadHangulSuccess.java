/*
 * 한글 텍스트 파일 일기
 */
package Week11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("C:\\Java_workspace\\Java_Practice\\src"
					+ "\\Week11\\InputStreamReader.txt");
			in = new InputStreamReader(fin,"MS949");
			int c;
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while((c=in.read())!=-1)
				System.out.print((char)c);
			in.close();		// 이곳에서  fin.close() 자동 호출 됨
			fin.close();	// 따라서 여기서 호출할 필요가 없음
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
