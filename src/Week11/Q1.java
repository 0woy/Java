/*
 * IStack<T> 인터페이스를 구현하는 MyStack<T> 클래스를 작성
 * 스택의 원소는 Vector<E>를 이용하여 저장.
 */
package Week11;
import java.util.Vector;

interface IStack<T>{
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack{
	Vector<T>vector;
	public MyStack(){
		vector = new Vector<T>();
	}
	
	public T pop() {
		if(vector.isEmpty())
			return null;
		T data	= vector.get(0);
		vector.remove(0);
		return data;
	}
	public boolean push(Object ob) {
		vector.add(0,(T)ob);
		return true;
	}

}
public class Q1 {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0;i<10;i++) 
			stack.push(i);
		
		while(true) {
			Integer n = stack.pop();
			if(n==null) break;
			System.out.print(n+" ");
		}
	}

}
