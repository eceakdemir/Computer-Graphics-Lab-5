package lab_5_exercises;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GrayCells extends Frame {
	
	public GrayCells() {
		
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
		int n_rows = 3;
		int n_cols = 3;
		float color_step = 1.0f/(n_rows * n_cols);
		float color_val = 1.0f;	
		int x_step = (this.getWidth() / n_cols);	
		int y_step = (this.getHeight() / n_rows);	
	
		for(int j = 0; j < n_cols; j++) {
			for(int i = 0; i < n_rows; i++) {
				int x = i * x_step;
				int y = j * y_step;
				//int y = 
				Color col = new Color(color_val, color_val, color_val);
				
				g2d.setColor(col);
				g2d.fillRect(x, y, x_step, y_step);
				color_val -= color_step;
			}
		}
	}	
	
	
	public static void main(String[] argv)
	{
		GrayCells f = new GrayCells();
		//f.setTitle("The first Java 2D program");
		f.setTitle("Four Colors");
		f.setSize(400, 400);
		f.setVisible(true);
		
	}	
		
	

	

}
