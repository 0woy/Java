package Week8;

class Stack{
	int top;
	int [] data;
	int len;
	public Stack() {
		this.top =-1;
		data = new int[20];
		this.len = 20;
	}
	public Stack(int len) {
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


class StackCal extends Stack{
	
	public int eval(String calc) {
		for(int i=0;i<calc.length();i++) {
			char c = calc.charAt(i);
			if(c!='+'&&c!='-'&&c!='*'&&c!='/') {
				push(c-'0');
			}
			else {
				int op2 = pop();
				int op1 = pop();
				switch(c) {
				case '+':
					push(op1+op2);
					break;
				case '-':
					push(op1-op2);
					break;
				case '*':
					push(op1*op2);
					break;
				case '/':
					push(op1/op2);
					break;
				}
			}	
		}
		return pop();
	}
}
public class Q2 {

	public static void main(String[] args) {
		StackCal s=new StackCal();
		int a= s.eval("23+5*9+");
		System.out.println(a);

	}

}
