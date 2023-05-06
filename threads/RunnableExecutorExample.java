package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
	private String name;
	
	public Task(String name)
	{
		this.name=name;
	}
	
	public void run()
	{
		System.out.println("Task "+name+" is running on thread "+Thread.currentThread().getName());
	}
}

public class RunnableExecutorExample {

	public static void main(String[] args) {
		// Create an
		ExecutorService executor=Executors.newFixedThreadPool(2); // Object looks for the run() method in the runnable object
		
		Runnable task1=new Task("Task 1");
		Runnable task2=new Task("Task 2");
		
		System.out.println("Starting Executor");
		
		executor.submit(task1);
		executor.submit(task2);
		
		executor.shutdown(); // Shut down the executor after all tasks have completed

	}

}
