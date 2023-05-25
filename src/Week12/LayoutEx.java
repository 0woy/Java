
package Week12;
import javax.swing.*;
import java.awt.*;

/*
 * 배치관리자 없는 컨테이너
 * 응용 프로그램에서 컴포넌트의 절대 크기와 절대 위치 결정
 * 용도
 * - 컴포넌트의 크기나 위치를 개발자 임의로 결정하고자 하는 경우
 * - 여러 컴포넌트들이 서로 겹쳐 출력하고자 하는 경우
 */

class NullContainerEx extends JFrame{
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, press Buttons!");
		la.setLocation(20,50);
		la.setSize(200,20);
		c.add(la);

		for(int i=1;i<=9;i++) {
			JButton button= new JButton(Integer.toString(i));
			button.setLocation(i*15,i*15);
			button.setSize(50,20);
			c.add(button);
		}
		
		setSize(300,200);
		setVisible(true);
	}
}

class Grid extends JFrame{
	public Grid(){
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		
		Container c = getContentPane();
	//	c.setBackground(Color.BLUE);
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		setSize(300,200);
		setVisible(true);
	}
}

/*
 * Border Layout
 * 컨테이너 공간을 5구역으로 분할 & 배치
 * 컨테이너의 크기가 변하면 재배치
 * BorderLayout(30,20): 컨테이너 사이 수평 간격: 30, 수직 간격: 20
 */

class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("Layout ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.BLUE);
		
		c.setLayout(new BorderLayout(30,20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER );
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH );
		c.add(new JButton("mul"), BorderLayout.EAST );
		c.add(new JButton("div"), BorderLayout.WEST );
		
		setSize(300,200);
		setVisible(true);
	}
}

public class LayoutEx extends JFrame{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
		new Grid();
		new NullContainerEx();
	}

}
