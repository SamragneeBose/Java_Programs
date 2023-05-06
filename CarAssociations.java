
class Engine
{
	void work()
	{
		System.out.println("Engine of Car has been started.");
	}
}

class Car
{
	//private final Engine engine; // Composition
	private Engine engine; // Aggregation
	
	Car()
	{
		System.out.println("This car has no engine.");
	}
	
	Car(Engine engine)
	{
		this.engine=engine;
	}
	
	void move()
	{
		if(engine!=null)
			System.out.println("Car is moving.");
		else
			System.out.println("Car is not moving.");
	}
}

public class CarAssociations {

	public static void main(String[] args) {
		Engine kappa=null;
		Engine gamma=new Engine();
		
		Car maruti=new Car(kappa);
		maruti.move();
		
		Car breeza=new Car(gamma);
		breeza.move();
		
		Car dzire=new Car();
				
	}

}
