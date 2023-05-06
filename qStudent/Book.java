package qStudent;
import java.util.Scanner;
public class Book {
	public String title, author;
	
	Book()
	{
		System.out.println("Book has been created.");
	}
	
	void readB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter title of the book: ");
		title=sc.nextLine();
		System.out.print("Enter author of the book: ");
		author=sc.nextLine();
		sc.close();
	}
	
	void display()
	{
		System.out.println("Book Title: " +title);
		System.out.println("Book Author: "+author);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
