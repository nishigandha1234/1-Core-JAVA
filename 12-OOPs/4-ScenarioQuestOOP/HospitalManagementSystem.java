/*1. Hospital Management System
In a hospital management application, you need to create an addPatient() method. Sometimes the receptionist enters only the patient's name and age, while in other cases they also enter address, phone number, and insurance details. How would you use method overloading to design the addPatient() functionality?
Scenario: A hospital receptionist may have different amounts of information when registering a patient.
Case 1: The patient provides **name, age, address, and phone number**.
Case 2: The patient is admitted with complete details such as **name, age, address, phone number, and insurance information, min advance amount.
*/
class Hospital
{
	public void addPatient(String name, int age, String address, String phone)
	{
		System.out.println("Patient Registered : ");
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		System.out.println("Phone : "+phone);
	}
	public void addPatient(String name, int age, String address, String phone, String insuranceDetails, double advanceAmount)
	{
		System.out.println("Patient Registered with Insurance : ");
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		System.out.println("Phone : "+phone);
		System.out.println("insuranceDetails : "+insuranceDetails);
		System.out.println("Minimum Amount : "+advanceAmount);
	}
	
}
public class HospitalManagementSystem
{
	public static void main(String x[])
	{
		Hospital h = new Hospital();
		h.addPatient("Ram", 21, "Pune", "7828321213");
		h.addPatient("Ram", 21, "Pune", "7828321213", "Star Health Policy", 5000);	
	}
}