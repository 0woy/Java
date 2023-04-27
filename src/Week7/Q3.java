package Week7;

import java.util.Random;

class Stack{
	int len;
	int top;
	int [] data;
	public Stack(int len) {
		this.len=len;
		this.top =-1;
		data = new int[len];
	}
	
	public boolean isFull() {return (top+1 == len);}
	public boolean isEmpty() {return top==-1;}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("스택 포화");
			return;
		}
		data[++top] = item; 
	}
	
	public int peek() {return  data[top];}
	public int pop() {return data[top--];}
}

public class Q3 {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		Random random = new Random();
		
		for(int i=random.nextInt(100);!s.isFull();i=i+random.nextInt(100)) 
			s.push(i);
		
		System.out.println("peek: "+s.peek());
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
