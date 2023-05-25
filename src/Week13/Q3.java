/*
 * 화면에 100 숫자 표시 및, 마우스로 클릭시 숫자 감소
 * 0이 되면 클리어라고 화면에 보임
 */
package Week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Week13.FlyingTextEx.MyKeyListener;


public class Q3 extends JFrame{
	public String count = "10";
	private JLabel la = new JLabel(count);
	public Q3() {
        setTitle("Mouse Dragging 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
       
    	c.setLayout(null);
    	c.addMouseListener(new MyMouse());		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		setSize(300,300);
		setVisible(true);
		

        setSize(250, 250);
        setVisible(true);
    }
	
	class MyMouse extends MouseAdapter { // MouseMotionAdapter 사용
        public void mousePressed(MouseEvent e) {
        	int n = Integer.parseInt(count)-1;
        	if(n ==0) la.setText("클리어!");
        	else {
        	count = Integer.toString(n);
        	la.setText(count);
        }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q3();

	}

}
