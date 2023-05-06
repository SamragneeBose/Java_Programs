package gui;
import javax.swing.*;

public class Swing1 {

	public static void main(String[] args) {
		int a, b, sum;
		String s1=JOptionPane.showInputDialog("Enter 1st value: ");
		a=Integer.parseInt(s1);
		String s2=JOptionPane.showInputDialog("Enter 2nd value: ");
		b=Integer.parseInt(s2);
		sum=a+b;
		JOptionPane.showMessageDialog(null, "The sum of 2 values entered = "+sum);

	}

}
