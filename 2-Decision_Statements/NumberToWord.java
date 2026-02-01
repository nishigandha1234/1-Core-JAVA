import java.util.*;

public class NumberToWord
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1 : 
			{
				System.out.println(num + " One"); 
				break;
			}
			case 2 : 
			{
				System.out.println(num + " Two"); 
				break;				
			}
			case 3 :  
			{
				System.out.println(num + " Three"); 
				break;	
			}
			case 4 :  
			{
				System.out.println(num + " Four"); 
				break;	
			}
			case 5 : 
			{
				System.out.println(num + " Five"); 
				break;	
			}
			default :
			{
				System.out.println("Invalid Number");
			}
		}
	}
}