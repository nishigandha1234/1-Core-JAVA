import java.util.Scanner;

class LCM
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number " );
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int max = n1 > n2 ? n1 : n2;
		
		while(true)
		{
			if(max%n1==0 && max%n2==0)
			{
				System.out.println("LCM : " + max);
				break;
			}
			max++;
		}
	}
}