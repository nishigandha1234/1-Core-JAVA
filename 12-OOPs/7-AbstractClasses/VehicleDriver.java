/*Question 45: Create an abstract class Vehicle to calculate fuel consumption.
Create abstract class Vehicle with: Abstract method calculateMileage() Create subclasses: Car ? mileage = distance / fuel 
Bike ? mileage = distance / fuel Program should calculate mileage based on input values. 
Input Vehicle: Car Distance: 150 km Fuel: 10 liters
Output Mileage: 15 km/l*/

import java.util.Scanner;
abstract class Vehicle
{
	abstract void calculateMileage();
} 
class Car extends Vehicle
{
	double distance;
	double fuel;
	
	Car(double distance, double fuel)
	{
		this.distance = distance;
		this.fuel = fuel;		
	}
	public void calculateMileage()
	{
		double mileage = distance / fuel;
		System.out.println("Mileage : " + mileage + "km/l");
	}
}
class Bike extends Vehicle
{
	double distance;
	double fuel;
	
	Bike(double distance, double fuel)
	{
		this.distance = distance;
		this.fuel = fuel;		
	}
	public void calculateMileage()
	{
		double mileage = distance / fuel;
		System.out.println("Mileage : " + mileage + "km/l");
	}
}
public class VehicleDriver
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Vehicle Type (Car/Bike) : ");
		String type = sc.next();
		
		System.out.println("Enter Distance : ");
		double distance = sc.nextDouble();
		System.out.println("Enter Fuel : ");
		double fuel = sc.nextDouble();
		
		Vehicle v1;
		
		if(type.equalsIgnoreCase("Car"))
		{
			v1 = new Car(distance, fuel);
		}
		else 
		{
			v1 = new Bike(distance, fuel);
		}
		v1.calculateMileage();
	}
}