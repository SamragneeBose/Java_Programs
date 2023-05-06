package gui;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Physics {
	
	private JFrame f;
	private JTextField i, v, r;
	private JButton b1, b2;
	private JLabel il, vl, rl;
	
	public Physics() {
		f=new JFrame();
		
		
		i=new JTextField(10);
		v=new JTextField(10);
		r=new JTextField(10);
		
		i.setText("0");
		v.setText("0");
		r.setText("0");
		
		il=new JLabel("Current");
		vl=new JLabel("Voltage");
		rl=new JLabel("Resistance");
				
		b1=new JButton("Calculate Current");
		b2=new JButton("Clear");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(vl);
		f.add(v);
		f.add(rl);
		f.add(r);
		f.add(il);
		f.add(i);
		f.add(b1);
		f.add(b2);
				
		b1.addActionListener(new ButtonListener1());
		b2.addActionListener(new ButtonListener2());
		
		f.setSize(600, 100);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.getContentPane().setBackground(Color.white);
		
	}
	
	public double calcI(double v, double r)
	{
		return v/r;
	}

	public double calcV(double i, double r)
	{
		return i*r;
	}
	
	public double calcR(double i, double r)
	{
		return i*r;
	}
	
	public static void main(String[] args) {
		Physics ob=new Physics();

	}
	
	private class ButtonListener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			String si=i.getText(), sv=v.getText(), sr=r.getText();
		
			if(si.equals("0") && !sv.equals("0") && !sr.equals("0"))
			{
				i.setText(Double.toString(calcI(Double.parseDouble(sv), Double.parseDouble(sr))));
			}
			else if(!si.equals("0") && sv.equals("0") && !sr.equals("0"))
			{
				v.setText(Double.toString(calcI(Double.parseDouble(si), Double.parseDouble(sr))));
			}
			else if(!si.equals("0") && !sv.equals("0") && !sr.equals("0"))
			{
				f.getContentPane().setBackground(Color.green);
				double ans=calcI(Double.parseDouble(sv), Double.parseDouble(sr));
				String s;
				
				if(Double.parseDouble(i.getText())==ans)
					s="Entered value of Current is correct!";
				else
					s="Entered value of Current is incorrect!";
				
				JOptionPane.showMessageDialog(null, s);
			}
			else
				JOptionPane.showMessageDialog(null, "Enter value for voltage and resistance.");
			
		}
	}
	
	private class ButtonListener2 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			f.getContentPane().setBackground(Color.white);
			
			i.setText("0");
			v.setText("0");
			r.setText("0");
			
		}
	}
}
