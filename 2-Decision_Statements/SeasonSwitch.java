import java.util.*;

public class SeasonSwitch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Season Choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 : 
			{
				System.out.println(choice + " Spring"); 
				break;
			}
			case 2 : 
			{
				System.out.println(choice + " Summer"); 
				break;				
			}
			case 3 :  
			{
				System.out.println(choice + " Autumn"); 
				break;	
			}
			case 4 :  
			{
				System.out.println(choice + " Winter"); 
				break;	
			}
			default :
			{
				System.out.println("Invalid Season");
			}
		}
	}
}