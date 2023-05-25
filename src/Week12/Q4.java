/*
 * 계산기 GUI 모양을 가진 스윙프레임을 작성
 */
package Week12;
import javax.swing.*;

import Week6.Calc;
import java.awt.*;

class North extends JPanel{
	public North() {
		setBackground(Color.lightGray);
		add(new JLabel("수식 입력"));
		add(new JTextField(16));
		setLayout(new FlowLayout());
	}
}

class Center extends JPanel{
	public Center() {
		GridLayout grid = new GridLayout(4,4,2,2);
		setLayout(grid);
	
		for(int i=0;i<=9;i++) {
			JButton btn = new JButton(Integer.toString(i));
			add(btn);
		}	
		String [] cal = {"CE","계산","+","-","X","/"};
		JButton btn[] = new JButton[6];
		
		for(int i=0;i<btn.length;i++) {
			btn[i] = new JButton(cal[i]); 
			if(i>=2)
				btn[i].setBackground(Color.cyan);	
			add(btn[i]);
		}

	}
}

class South extends JPanel{
	public South() {
		
		add(new JLabel("계산 결과"));
		add(new JTextField(16));
		setBackground(Color.yellow);
		setLayout(new FlowLayout());
	}
}

public class Q4 extends JFrame{
	public Q4() {
		
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.add(new North(), BorderLayout.NORTH);
		c.add(new Center(), BorderLayout.CENTER );
		c.add(new South(), BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Q4();

	}

}
