/*
 * 익명 클래스로 Action 이벤트 리스너 만들기
 */
package Week13;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AnonymousClassListener extends JFrame{
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();
		
		container.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		container.add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton)e.getSource();
				if(button.getText().equals("Action")) btn.setText("액션");
				else button.setText("Action");
				setTitle(button.getText());	// AnonymousClassLister, JFrame 멤버 호출 가능
				
			}
		});
		setSize(350,150);
		setVisible(true);
	
	
	}
	
	
	public static void main(String[] args) {
		new AnonymousClassListener();

	}

}
