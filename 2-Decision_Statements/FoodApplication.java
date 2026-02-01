import java.util.*;

public class FoodApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Food Choice : ");
		System.out.println("1 : Burger ");
		System.out.println("2 : Pizza");
		System.out.println("3 : Pasta");
		System.out.println("4 : Sandwich");
		int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1 : 
			{
				System.out.println(choice + " Burger"); 
				System.out.println("Price : 100.00"); 
				break;
			}
			case 2 : 
			{
				System.out.println(choice + " Pizza"); 
				System.out.println("Price : 150.00");  
				break;				
			}
			case 3 :  
			{
				System.out.println(choice + " Pasta"); 
				System.out.println("Price : 90.00"); 
				break;	
			}
			case 4 :  
			{
				System.out.println(choice + " Sandwich"); 
				System.out.println("Price : 110.00");  
				break;	
			}
			default :
			{
				System.out.println("Invalid Selection");
			}
		}
	}
}