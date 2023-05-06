package beans;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class CustomComponent extends JComponent implements java.io.Serializable{
	private int x, y, height, width;
	private Color color;
	
	public CustomComponent() {
		x=0;
		y=0;
		height=50;
		width=50;
		color=Color.red;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x=x;
		repaint();
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setY(int y)
	{
		this.y=y;
		repaint();
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width)
	{
		this.width=width;
		repaint();
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height=height;
		repaint();
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void setColor(Color color)
	{
		this.color=color;
		repaint();
	}
	
	public Dimension getPreferredSize()
	{
		return new Dimension(width, height);
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

}
