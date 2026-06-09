/* we have Employee data with field id,name and salary and we want to provide salary to employee and salary amount should be greater than 0.*/

class Employee
{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int id)
	{
		this.id =id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name =name;
	}
	public String getName()
	{
		return name;
	}
	public void setSal(int sal)
	{
		if(sal > 0)
		{
			this.sal = sal;
		}
		else
		{
			System.out.println("Give some Salary amount to Employee");
		}
	}
	public int getSal()
	{
		return sal;
	}
}
public class EmployeeApp
{
	public static void main(String x[])
	{
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Ram");
		emp.setSal(2000);
		System.out.println("Id : "+emp.getId()+" Name : "+emp.getName()+" Salary : "+emp.getSal());emp.setId(2);
		emp.setName("Shyam");
		emp.setSal(1000);
		System.out.println("Id : "+emp.getId()+" Name : "+emp.getName()+" Salary : "+emp.getSal());
	}
}