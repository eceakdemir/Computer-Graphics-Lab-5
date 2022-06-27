package lab_5_exercises;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class GrayRows extends Frame {
	
	public GrayRows() {
		
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
		int n_rows = 10;
		float color_step = 1.0f/n_rows;
		int x = 0;
		int y = 0;
		int y_step = this.getHeight()/n_rows;
		int height = y_step;
		for(int i = 0; i < n_rows; i++) {
			float val = (n_rows - 1 - i)*color_step;
			Color col = new Color(val, val, val);
			g2d.setColor(col);
			g2d.fillRect(x, y, this.getWidth(), height);
			y += y_step;
		}
		
	
		
		
	
	}	
	
	
	public static void main(String[] argv)
	{
		GrayRows f = new GrayRows();
		//f.setTitle("The first Java 2D program");
		f.setTitle("Four Colors");
		f.setSize(400, 400);
		f.setVisible(true);
		
	}	
		
	

	

}


