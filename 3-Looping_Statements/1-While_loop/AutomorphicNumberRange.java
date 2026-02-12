import java.util.Scanner;

class AutomorphicNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range :");
		int n = sc.nextInt();
		int i =1;
		while(i<=n)
		{
			int temp = i;
			int square = temp*temp;
			while(temp!=0)
			{
				if(temp%10 == square%10){
					System.out.println(i);
					return;
				}
				temp/=10;
				square/=10;
			}
			i++;
		}
	}	
}