package inheritanceTypes;

public class Hierarchical2 extends Super{

	void display()
	{
		super.display();
		System.out.println("This is class Hierarchical2 inherits from class Super.");
	}
	public static void main(String[] args) {
		Hierarchical2 obj=new Hierarchical2();
		obj.display();

	}

}
