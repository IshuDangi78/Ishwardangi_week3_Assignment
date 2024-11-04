package Week3;

class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle is starting");
	}
}
class Car extends Vehicle
{
	public void start()
	{
		System.out.println("Car is starting with a key");
	}
}
class Bike extends Vehicle
{
	public void start()
	{
		System.out.println("Bike is starting with a kick");
	}
}

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vehicle myCar=new Car();
		Vehicle myBike=new Bike();
		//polymorphism
		myCar.start();
		myBike.start();
		
		
	}

}
