/*
 * 1. 300x300 크기의 스윙 프레임 만들기(JFrame 클래스 상속)
 * 2. 3개의 버튼 컴포넌트를 가진 스잉프레임 만들기
 * 3. FlowLayout 배치 관리자 활용
 */
package Week12;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("300x300 ContentPane & FlowLayout");
		
		// 프레임 종료 버튼 클릭시, 프레임을 닫고 응용 프로그램 종료 방법
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();			// 컨테이너 알아내기
		c.setBackground(Color.ORANGE);
		
		// 수평 간격: 30, 수직 간격: 40, LEFT 정렬
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));	
			
		c.add(new JButton("Add"));	// 버튼 만들고 컨테이너에 컴포넌트 달기
		c.add(new JButton("Sub"));
		c.add(new JButton("Mul"));
		c.add(new JButton("Div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,300);	// 프레임 크기: 300x300
		setVisible(true);	// 프레임 출력
	}
	public static void main(String[] args) {
		new MyFrame();		

	}

}
