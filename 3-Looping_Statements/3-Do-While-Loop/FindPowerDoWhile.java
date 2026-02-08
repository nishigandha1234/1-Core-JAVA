import java.util.Scanner;

public class FindPowerDoWhile
{
	public static void main(String x[])
	{	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Base Value  : ");
		int base = sc.nextInt();
		System.out.println("Enter the Power : ");
		int index = sc.nextInt();
		int pow = 1, i = 1;
		do{
			pow*=base;
			i++;
		}
		while(i<= index);
		System.out.println(pow);
	}
}