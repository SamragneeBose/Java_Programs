package threads;

class Threads2 implements Runnable
{
	public void run()
	{
		System.out.println("I am Thread Demo and I am running.");
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		Threads2 t1=new Threads2();
		t1.run();

	}

}
