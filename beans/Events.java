package beans;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class Events implements java.io.Serializable{
	private JFrame f;
	private JTextField tf;
	private JButton b;
	
	Events()
	{
		f=new JFrame();
		tf=new JTextField(20);
		b=new JButton("Button");
		
		f.add(tf);
		f.add(b);
		
		tf.addFocusListener(new Focus());
		
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
	}
	
	public String getTextField()
	{
		return tf.getText();
	}
	
	public void setTextField(String s)
	{
		tf.setText(s);
	}
	
	public static void main(String[] args) {
		Events  ob=new Events();
	}

	private class Focus implements FocusListener
	{
		@Override
		public void focusGained(FocusEvent e) {
			System.out.println("Focus Gained.");
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			System.out.println("Focus Lost.");
			
		}
	}
	
}
