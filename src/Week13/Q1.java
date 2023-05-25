/*
 * 컨텐트 팬의 배경은 초록, 마우스를 드래그 하는 동안만 배경이 노란색으로 유지되는 프로그램
 */
package Week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Q1 extends JFrame{
	public Q1() {
        setTitle("Mouse Dragging 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        
        c.addMouseMotionListener(new MyMouse());
        c.addMouseListener(new MyMouse());

        c.setBackground(Color.CYAN);
        setSize(250, 250);
        setVisible(true);
    }

    class MyMouse extends MouseAdapter { // MouseMotionAdapter 사용
        public void mouseDragged(MouseEvent e) {
            Component c = (Component) e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseReleased(MouseEvent e) { // 메서드 이름 수정
            Component c = (Component) e.getSource();
            c.setBackground(Color.CYAN);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q1();

	}

}
