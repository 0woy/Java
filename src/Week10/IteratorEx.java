/*
 * 컬렉션의 순차 검색을 위한 Iterator 예제
 */
package Week10;
import java.util.*;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(5);
		vector.add(4);
		vector.add(-1);
		vector.add(2,100);
		
		// Iterator를 이용한 모든 정수 출력
		Iterator <Integer> it=vector.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		// Iterator를 이용하여 모든 정수 더하기
		int sum =0;
		it = vector.iterator();
		while(it.hasNext()) {
			sum+=it.next();
		}
		System.out.println("벡터에 있는 정수의 합: "+sum);
	}

}
