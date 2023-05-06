interface Animal
{
	public static final String tname="Hello";
	void speed();
	void name(String tname);
	default void show()
	{
		System.out.println("I am default method of Interface Animal.");
	}
}

interface FastAnimal
{
	void run(int a);
	default void show()
	{
		System.out.println("I am default method of interface FastAnimal.");
	}
	static void roar()
	{
		System.out.println("I am static method of interface FastAnimal.");
	}
}

public class TigerInterface implements Animal, FastAnimal{
	
	@Override
	public void name(String tname) {
		System.out.println("Colur of the Tiger is "+tname+".");
		
	}

	public void run(int a)
	{
		System.out.println("I can run at "+a+"km/h.");
	}
	
	public void show()
	{
		// Interface.super.methodName();
		Animal.super.show();
		FastAnimal.super.show();
	}
	
	public void speed()
	{
		System.out.println("I have high speed.");
	}
	
	public void roar()
	{
		System.out.println("I am the roar of a Tiger.");
	}
	
	public static void main(String[] args) {
		TigerInterface t1=new TigerInterface();
		t1.name("White");
		t1.speed();
		t1.run(65);
		t1.show();
		t1.roar();
		FastAnimal.roar(); // Calling static method in the interface

	}
}
