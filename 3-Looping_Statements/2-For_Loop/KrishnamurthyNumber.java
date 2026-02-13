import java.util.Scanner;
//Strong Number/proson number //145= 1!+4!+5!
class KrishnamurthyNumber
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		for(int j =1 ; j < n ;j++)
		{
			int sum = 0;
			int num = j;
			while(num != 0) // 145
			{
				int rem = num%10; // 5
				int fact =1 ; 
				
				for(int i = 1 ; i <= rem ; i++) 
				{
					fact*=i; //5*
				}
				sum+=fact;
				num/=10;
			}
			System.out.print(sum==j ? j +" ":"");
		}
	}
}