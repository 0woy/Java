package Week12;
import javax.swing.*;
import javax.swing.text.html.CSS;

import java.awt.*;

public class Q3 extends JFrame {
	public Q3() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,4,0,0);
		Color[] colors = {new Color(255,0,0), new Color(255, 200, 0),new Color(255, 255, 0),new Color(0, 255, 0),
				new Color(0, 255, 255),new Color(255, 0, 255),new Color(255, 175, 175), new Color(64, 64, 64),
				new Color(255, 175, 175), new Color(192, 192, 192), new Color(255, 255,255), new Color(0, 0, 0)
				, new Color(0, 0, 0),new Color(255, 255, 0),new Color(255, 0, 255),new Color(255, 175, 175)};
		
		Container c = getContentPane();
		c.setLayout(grid);
		for(int i=0;i<16;i++) {
		
			JLabel label = new JLabel(Integer.toString(i));
			label.setOpaque(true);
			label.setBackground(colors[i]);
			c.add(label);

		}
		
		setSize(400,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Q3();
	}

}
