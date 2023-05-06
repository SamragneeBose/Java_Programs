package threads;

class Threads1 extends Thread
{
	public void run() // Overriding the run() method in Thread class
	{
		System.out.println("I am Thread Demo and I am running.");
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		Threads1 t1=new Threads1();
		t1.run();

	}

}
