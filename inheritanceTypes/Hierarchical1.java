package inheritanceTypes;

public class Hierarchical1 extends Super{

	void display()
	{
		super.display();
		System.out.println("This is class Hierarchical1 inherits from class Super.");
	}
	public static void main(String[] args) {
		Hierarchical1 obj=new Hierarchical1();
		obj.display();

	}

}
