import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	

	public void paint(Graphics g) {
		
		
		//change color before any draw or fill
		g.setColor( new Color(128, 128, 140) ); //r,g,b
		g.fillOval(200, 200, 350, 250);
	
		
		//first two values control the x & y coordinates
		//the last two values control the width and height
		
		
		g.setColor( new Color(173, 216, 230) );
		g.fillOval(300, 180, 150, 150);
		
		g.setColor( new Color(173, 216, 230) );
		g.fillOval(300, 380, 50, 50);
		
		g.setColor( new Color(173, 216, 230) );
		g.fillOval(220, 330, 50, 50);
		
		g.setColor( new Color(173, 216, 230) );
		g.fillOval(480, 330, 50, 50);
		
		g.setColor( new Color(173, 216, 230) );
		g.fillOval(400, 380, 50, 50);
		
		g.setColor( new Color(20, 90, 36) );
		g.fillOval(340, 228, 75, 100);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		MethodPractice m = new MethodPractice();
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
