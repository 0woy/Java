/*
 * 더블 클릭시 컨텐트 팬의 배경색 변경
 */
package Week13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ClickAndDoubleClieckEx extends JFrame{

	public ClickAndDoubleClieckEx() {
		setTitle("Click and DoubleClick 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() ==2) {	// 더블 클릭
				int r=(int)(Math.random()*256); //[0~255 사이 정수값 리턴]
				int g=(int)(Math.random()*256);
				int b=(int)(Math.random()*256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,g,b));
				
			}
		}
	}
	public static void main(String[] args) {
		new ClickAndDoubleClieckEx();

	}

}
