package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends Frame implements ActionListener{
	static JPanel p;
	static JTextField tf;
	static JButton[] b=new JButton[16];
	String s1, s2, s3;
	
	public Calculator() {
		s1=s2=s3="";
		

		p=new JPanel();
		tf=new JTextField();
		
		for(int i=0; i<10; i++)
			b[i]=new JButton(Integer.toString(i));
		b[10]=new JButton(".");
		b[11]=new JButton("+");
		b[12]=new JButton("-");
		b[13]=new JButton("*");
		b[14]=new JButton("/");
		b[15]=new JButton("=");
		
		p.add(tf);
		
		for(int i=1; i<10; i++)
		{
			if(i==4)
				p.add(b[11]);
			else if(i==7)
				p.add(b[12]);
			
			p.add(b[i]);
		}
		
		p.add(b[13]);
		p.add(b[10]);
		p.add(b[0]);
		p.add(b[15]);
		p.add(b[14]);		
		
		p.setSize(300, 300);
		p.setLayout(new GridLayout(4, 4));
		p.setVisible(true);
		
		tf.setEditable(false);
	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
//		
//		p=new JPanel();
//		tf=new JTextField();
//		
//		for(int i=0; i<10; i++)
//			b[i]=new JButton(Integer.toString(i));
//		b[10]=new JButton(".");
//		b[11]=new JButton("+");
//		b[12]=new JButton("-");
//		b[13]=new JButton("*");
//		b[14]=new JButton("/");
//		b[15]=new JButton("=");
//		
//		p.add(tf);
//		
//		for(int i=1; i<10; i++)
//		{
//			if(i==4)
//				p.add(b[11]);
//			else if(i==7)
//				p.add(b[12]);
//			
//			p.add(b[i]);
//		}
//		
//		p.add(b[13]);
//		p.add(b[10]);
//		p.add(b[0]);
//		p.add(b[15]);
//		p.add(b[14]);
//		
		for(int i=0; i<=15; i++)
			b[i].addActionListener(c1);
//		
//		
//		p.setSize(300, 300);
//		p.setLayout(new GridLayout(4, 4));
//		p.setVisible(true);
//		
//		tf.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		
		char ch=s.charAt(0);
		
		if(Character.isDigit(ch) || ch=='.')
		{
			if(!s2.equals(""))
				s3=s3+s;
			else
				s1=s1+s;
			
			tf.setText(s1+s2+s3);
		}
		else if(ch=='=')
		{
			double result, a=Double.parseDouble(s1), b=Double.parseDouble(s3);
			
			if(s2.equals("+"))
				result=a+b;
			else if(s2.equals("-"))
				result=a-b;
			else if(s2.equals("/"))
				result=a/b;
			else
				result=a*b;
			
			tf.setText(s1+s2+s3+"="+result);
			
			s1=Double.toString(result);
			
			s2=s3="";
		}
		else
		{
			if(s2.equals("") || s3.equals(""))
				s2=s;
			else
			{
				double result, a=Double.parseDouble(s1), b=Double.parseDouble(s3);
				
				if(s2.equals("+"))
					result=a+b;
				else if(s2.equals("-"))
					result=a-b;
				else if(s2.equals("/"))
					result=a/b;
				else
					result=a*b;
				
				s1=Double.toString(result);
				
				s2=s;
				
				s3="";
			}
			
			tf.setText(s1+s2+s3);
		}
		
		
	}

}
