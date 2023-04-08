/*
 * 정수 4개를 가지는 일차원 배열 생성, 1,2,3,4로 초기화 한 다음,
 * 배열을 return 하는 makeArray() 를 작성하고
 * 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램
 */
package Week6;
public class ReturnArray {

	// 정수형 배열을 리턴하는 메서드
	static int[] makeArray() {
		int temp[] = new int[4];
		for(int i=0;i<temp.length;i++)
			temp[i]=i+1;	//배열의 원소를 1,2,3,4 초기화
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];	//배열 레퍼런스 변수 선언
		intArray = makeArray();
		for(int i =0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
	}

}
