package exceptionHandling;
import java.util.*;
public class Handling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		int a=sc.nextInt();
		int b=sc.nextInt();
		double div=a/b;
		System.out.println(div);
		}
		catch(InputMismatchException e)
		{
			System.err.println("InputMismatchException occurred.");
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException occurred.");
		}
		finally
		{
			System.out.println("Program successfully executed.");
		}
		System.out.println("The End!");
		sc.close();
		//InputMismatchException
		//ArithmeticException
	}

}
