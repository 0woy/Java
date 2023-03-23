package Week1;
import java.util.Scanner;
public class ScannerEX {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		System.out.print("이름은 "+name+", ");

		String city = scanner.next();
		System.out.print("도시는 "+city+", ");

		int age = scanner.nextInt();
		System.out.print("나이는 "+age+", ");

		double weight = scanner.nextDouble();
		System.out.print("체중은"+weight+", ");

		boolean isSingle = scanner.nextBoolean();
		System.out.print("독신여부:"+isSingle+", ");
		scanner.close(); // 닫아주지 않으면 나중에 병목현상이 발생할 수 있음
	}
}
