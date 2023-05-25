/*
 * 상 하 좌 우 키로 Hello 문자열 움직이기
 */

package Week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT=10;
	private JLabel la = new JLabel("HELLO");
	
	public FlyingTextEx() {
		setTitle("상하좌우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		c.addKeyListener(new MyKeyListener());
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		
		// 키 이벤트를 받을 수 있는 조건: 모든 컴포넌트가 가능하지만, 현재 포커스를 가진 컴포넌트
		c.setFocusable(true);	//component가 포커스를 받을 수 있도록 설정
		c.requestFocus();		// component에 포커스 강제 지정
		
		// 컨텐트팬에 포커스를 잃은 경우 마우스를 클릭하면 다시 포커스를 얻게 됨
//		c.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				Container c =(Container)e.getSource();
//				c.setFocusable(true);
//				c.requestFocus();
//			}
//		});
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_UP: 
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN: 
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT: 
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				break;
			case KeyEvent.VK_RIGHT: 
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
