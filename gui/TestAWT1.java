package gui;
import java.awt.*;

public class TestAWT1 extends Frame{

	public TestAWT1() {
		Button btn=new Button("Hello World!");
		Label lb=new Label("Welcometo Java Graphics!");
		add(btn);
		add(lb);
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		setBackground(Color.red);
	}
	
	public static void main(String[] args) {
		TestAWT1 t1=new TestAWT1();

	}

}
