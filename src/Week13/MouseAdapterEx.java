/*
 * 마우스 어댑터를 사용한 예제
 * 클릭한 위치로 Label이동
 */
package Week13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame{
	private JLabel label = new JLabel("Hello");
	
	public MouseAdapterEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new myMouseAdapter());
		
		c.setLayout(null);
		label.setSize(50,20);
		label.setLocation(30,30);
		c.add(label);
		
		
		setSize(250,250);
		setVisible(true);
	
	}
	
	class myMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x =e.getX();
			int y =e.getY();
			label.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new MouseAdapterEx();
	}
}
