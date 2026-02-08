import java.util.Scanner;

class FindFactorsFor
{	
	public static void main(String[]x)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		for(int i = 1; i<num ; i++)
		{	
			if(num % i == 0)
			{	
				System.out.println("Factors of Number is : "+ i);
			}	
		}
	}
}