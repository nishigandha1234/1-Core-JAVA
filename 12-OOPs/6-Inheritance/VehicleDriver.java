/*Question 2: Create a base class Vehicle with attributes brand and speed. Create a child class Car that adds fuelType. Display all details using inheritance.
Description : This program shows how a child class accesses parent properties and adds its own features. Useful to understand data reuse using inheritance.
Input : Enter Brand: Toyota Enter Speed: 120 Enter Fuel Type: Petrol
Output : Brand: Toyota Speed: 120 km/h Fuel Type: Petrol*/
import java.util.Scanner;
class Vehicle
{
	String brand;
	int speed;
	
	void acceptVehicle()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter brand : ");
		brand = sc.next();
		System.out.println("Enter Speed : ");
		speed = sc.nextInt();
	}
	void displayVehicle()
	{
		System.out.println("Enter brand : "+brand);
		System.out.println("Enter Speed : "+speed);	
	}
}
class Car extends Vehicle
{
	String fuelType;
	
	void acceptFuel()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fuel : ");
		fuelType = sc.next();
	}
	void displayFuel()
	{
		System.out.println("Fuel : "+fuelType);
	}
}
public class VehicleDriver
{
	public static void main(String x[])
	{
		Car c = new Car();
		c.acceptVehicle();
		c.acceptFuel();
		c.displayVehicle();
		c.displayFuel();
	}
}