package com.anUninspiredInsight.programs;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class Ball {
	static int         defaultDiameter = 10;
	static Color       defaultColor = Color.yellow;
	static Rectangle   defaultBox = new Rectangle(0,0,100,100);
	
	int x,y;

    int dx,dy;	

    int diameter;

    Color color;

   Rectangle box;

   Ball(int x0, int y0, int dx0, int dy0){
	   x = x0; y= y0; dx =dx0; dy = dy0;
	   color = defaultColor;
	   diameter = defaultDiameter;
   }
   public void setColor(Color c) {
	   color = c;
   }
   
   public void setBoundingBox(Rectangle r) {
	   box = r;
   }

   public void paint(Graphics g) {
	   g.setColor(color);
	   g.fillOval(x, y, diameter, diameter);
   }
   
  void constrain() {
	  int		x0=box.x;
	  int		y0=box.y;
	  int       x1=x0+box.width-diameter;
	  int		y1=y0+box.height-diameter; 

	  if (x < x0)
		  dx = Math.abs(dx);
	  if (x > x1)
		  dx = -Math.abs(dx);
	  if (y < y0)
		  dy = Math.abs(dy);
	  if (y >y1)
		  dy = -Math.abs(dy);
  }
  public void action() {
	  
  x = x + dx;
  y = y + dy;
  constrain();
  }

   
   
}

class BallPanel extends JPanel implements ActionListener{
	int width, height;
	
	Ball ball;
	
	private Timer timer = new Timer(50, this );
	public BallPanel(int width, int height ) {
		this.width = width;
		this.height = height;
		
		ball = new Ball(width/10, height/5, 5,5);
		ball.setBoundingBox(new Rectangle (0,0,width, height));
		timer.start();
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		ball.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (width != getWidth() || height != getHeight())
			wasResized(getWidth(),getHeight() );
		ball.action();
		repaint();
		
	} 
	public void wasResized(int newWidth, int newHeight ) {
		width = newWidth;
		height = newHeight;
	}

}

