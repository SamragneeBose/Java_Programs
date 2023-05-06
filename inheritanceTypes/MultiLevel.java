package inheritanceTypes;

class Level1
{
	void display()
	{
		System.out.println("This is the base class Level1.");
	}
}

class Level2 extends Level1
{
	void display()
	{
		super.display();
		System.out.println("This is the derived class Level2 which inherits from class Level1.");
	}
}

public class MultiLevel extends Level2{

	void display()
	{
		super.display();
		System.out.println("This is the derived class MultiLevel which inherits from class Level2");
	}
	public static void main(String[] args) {
		MultiLevel obj=new MultiLevel();
		obj.display();

	}

}
