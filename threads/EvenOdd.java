package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Even implements Runnable
{
	public void run()
	{
		for(int i=0; i<=100; i+=2)
			System.out.println("Even: "+i);
	}
}

class Odd implements Runnable
{
	public void run()
	{
		for(int i=1; i<=100; i+=2)
			System.out.println("Odd: "+i);
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		Runnable even=new Even();
		Runnable odd=new Odd();
		
		executor.submit(odd);
		executor.submit(even);
		
		executor.shutdown();

	}

}
