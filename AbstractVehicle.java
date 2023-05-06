abstract class Vehicle
{
	abstract void engineStart(); 
}

class MotorBike extends Vehicle
{
	void engineStart()
	{
		System.out.println("Motor Bike Engine");
	}
}

class Bus extends Vehicle
{
	void engineStart()
	{
		System.out.println("Bus Engine");
	}
}

public class AbstractVehicle {

	public static void main(String[] args) {
		Vehicle v1=new MotorBike(); // Dynamic Binding
		v1.engineStart();
		
		MotorBike obj=new MotorBike(); // Static Binding
		obj.engineStart(); 
		
		v1=new Bus(); // Dynamic Binding
		v1.engineStart();

	}

}
