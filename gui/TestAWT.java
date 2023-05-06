package gui;
import java.awt.*;

public class TestAWT {

	public TestAWT() {
		Frame fm=new Frame();
		Button btn=new Button("Hello World!");
		Label lb=new Label("Welcome to Java Graphics");
		fm.add(btn);
		fm.add(lb);
		fm.setSize(300, 300);
		fm.setLayout(new FlowLayout());
		fm.setVisible(true);
		fm.setBackground(Color.red);
		
	}
	public static void main(String[] args) {
		TestAWT t1=new TestAWT();
	}
}
