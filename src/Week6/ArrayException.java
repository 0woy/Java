/*
 * 배열의 인덱스가 범위를 벗어날 때 발생하는 
 * ArrayIndexOutOfBoundsExceptions을 처리하는 프로그램
 */
package Week6;

public class ArrayException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "] =" + intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어남");
		}

	}

}
