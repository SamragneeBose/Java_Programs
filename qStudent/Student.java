package qStudent;
import java.util.Scanner;
public class Student {
	private String name;
	public String email;
	
	Book obj=new Book(); // Aggregation
	
	void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=sc.nextLine();
		System.out.print("Enter email: ");
		email=sc.nextLine();
		obj.readB();
		sc.close();
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Email ID: "+email);
		obj.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
