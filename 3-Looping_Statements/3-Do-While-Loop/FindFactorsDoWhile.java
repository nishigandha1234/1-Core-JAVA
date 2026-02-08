import java.util.Scanner;

class FindFactorsDoWhile
{	
	public static void main(String[]x)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int i = 1;
		do{
			if(num % i == 0) 
			{	
				System.out.println("Factors are : "+i);
				i++;
			}
		}
		while(i < num);
	}
}