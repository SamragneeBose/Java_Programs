package inheritanceTypes;

class Base
{
	void display()
	{
		System.out.println("This is the base class.");
	}
}
public class Simple extends Base{

	void display()
	{
		super.display();
		System.out.println("This class inherits from class Base.");
	}
	public static void main(String[] args) {
		Simple obj=new Simple();
		obj.display();

	}

}
