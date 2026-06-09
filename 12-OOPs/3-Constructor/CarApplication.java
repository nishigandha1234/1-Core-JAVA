/*Question 8: Write a Java program to create a Car class and display car details using constructor.
Description: Create Car POJO class with carId, carName and price. Initialize values using constructor and display car information.
INPUT: Enter Car Id: 301 Enter Car Name: Swift Enter Price: 650000
OUTPUT: Car Details: Id: 301 Name: Swift Price: 650000*/

class Car
{
	private int carId;
	private String carName;
	private int price;

	Car(int carId, String carName, int price)
	{
		this.carId = carId;
		this.carName = carName;
		this.price = price;
	}
	public void setCarId(int carId)
	{
		this.carId = carId;
	}	
	public int getCarId()
	{
		return carId;
	}
	public void setCarName(String carName)
	{
		this.carName = carName;
	}	
	public String getCarName()
	{
		return carName;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
}
public class CarApplication 
{
	public static void main(String x[])
	{
		Car car = new Car(301, "Fortuner", 65000);
		System.out.println("Car Details : ");
		System.out.println("Car Id : "+ car.getCarId());
		System.out.println("Car Name : "+ car.getCarName() );
		System.out.println("Car price : "+car.getPrice());
    }
}