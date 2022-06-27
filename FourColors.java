package lab_5_exercises;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class FourColors extends Frame {
	
	public FourColors() {
		
		addWindowListener(new MyFinishWindow());
		// TODO Auto-generated constructor stub
	}	
	
	public class MyFinishWindow extends WindowAdapter
	{
		     public void windowClosing(WindowEvent e)
		     {
		       System.exit(0);
		     }
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		int x = 0;
		int y = 0;
		int width = this.getWidth()/2;
		int height = this.getHeight()/2;
		g2d.fillRect(x, y, width, height);
		
		x += width;
		g2d.setColor(Color.GREEN);
		g2d.fillRect(x, y, width, height);
		
		x = 0;
		y += height;
		g2d.setColor(Color.BLUE);
		g2d.fillRect(x, y, width, height);
		
		x += width;
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, y, width, height);
	
		
		
	
	}	
	
	
	public static void main(String[] argv)
	{
		FourColors f = new FourColors();
		//f.setTitle("The first Java 2D program");
		f.setTitle("Four Colors");
		f.setSize(400, 400);
		f.setVisible(true);
		
	}	
		
	

	

}

