import java.util.*;

public class GradeSystemSwitch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Grade from Below : ");
		System.out.println("1.A : ");
		System.out.println("2.B : ");
		System.out.println("3.C : ");
		System.out.println("4.D : ");
		System.out.println("5.F : ");
		
		int numOfGrade = sc.nextInt();
		
		switch(numOfGrade)
		{
			case 1 : 
			{
				System.out.println(numOfGrade + " Excellent"); 
				break;
			}
			case 2 : 
			{
				System.out.println(numOfGrade + " Good"); 
				break;				
			}
			case 3 : 
			{
				System.out.println(numOfGrade + " Average"); 
				break;	
			}
			case 4 : 
			{
				System.out.println(numOfGrade + " Poor"); 
				break;	
			}
			case 5 : 
			{
				System.out.println(numOfGrade + " Fail"); 
				break;	
			}
			default :
			{
				System.out.println("Invalid Grade entered");
			}
		}
	}
}