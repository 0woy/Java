/*
 * FileOutputStream으로 바이너리 파일 쓰기
 */
package Week11;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOEx {

	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = 
					new FileOutputStream("C:\\Java_workspace\\Java_Practice\\src"
							+ "\\Week11\\FileInOutStream",true);
			for(int i=0;i<b.length;i++)
				fout.write(b[i]);
			fout.close();
		} catch (IOException e) {
			System.out.println("저장할 수 없습니다. 경로를 확인해 주세여");
			return;
		}
		System.out.println("저장완료");

	}

}
