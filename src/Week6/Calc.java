/*
 * 사용자가 명령행에 입력한 여러 개의 실수를 main() 메서드에서 전달바당
 * 합을 구하는 프로그램 작성
 * Run: Run메뉴 > RunConfiguration > Arguments >ProgramArguments에 작성
 */
package Week6;
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum =0.0;
		for(int i =0;i<args.length;i++)
			sum+=Double.parseDouble(args[i]);
		System.out.println("sum= "+sum);
	}

}
