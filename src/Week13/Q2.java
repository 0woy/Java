/*
 * JLabel을 활용하여 LOVE JAVA를 출력하고 왼쪽 화살표 키를 입력할 때마다
 * 문자열이 왼쪽으로 회전하는 프로그램 작성
 */
package Week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q2 extends JFrame{
	private String tmp = "LOVE JAVA";
	private JLabel la = new JLabel(tmp);
	
	public Q2() {
		setTitle("Mouse Dragging 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//c.addMouseListener(new MyMouse());

		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKey());
		la.setSize(80,20);

		c.add(la);
		
		setSize(500,250);
		setVisible(true);
		
		c.setFocusable(true);	//component가 포커스를 받을 수 있도록 설정
		c.requestFocus();		// component에 포커스 강제 지정
		
		// 컨텐트팬에 포커스를 잃은 경우 마우스를 클릭하면 다시 포커스를 얻게 됨
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Container c =(Container)e.getSource();
				c.setFocusable(true);
				c.requestFocus();
			}
		});
	}
	class MyKey extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			if(keycode == KeyEvent.VK_LEFT) {
				
				String first = tmp.substring(0,1);
				String last = tmp.substring(1);	              
	            
				tmp=last+first;
				la.setText(tmp);
			}
		}
	}

	public static void main(String[] args) {
		new Q2();
	}

}
