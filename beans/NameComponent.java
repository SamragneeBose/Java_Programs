package beans;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NameComponent{

	private JFrame f;
	private JLabel l;
	private JTextField tf;
	private static JButton b;
	
	public NameComponent() {
		f=new JFrame();
		l=new JLabel("Enter your name : ");
		tf=new JTextField(20);
		b=new JButton("Click");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(l);
		f.add(tf);
		f.add(b);
		
		b.addActionListener(new ButtonListener());
		
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		NameComponent nc=new NameComponent();
		
		
		
	}

	public String getName()
	{
		return tf.getText();
	}
	
	public void setName(String name)
	{
		tf.setText(name);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			String name=getName();
			System.out.println(name);
			
		}
	}
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String s=e.getActionCommand();
//		
//		System.out.println(s);
//		
//	}

}
