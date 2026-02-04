import java.util.*;

public class FindNotesApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount : ");
		int n500 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1= 0;
		int amount = sc.nextInt();
		
		if(amount >= 500)
		{
			n500 = amount / 500;
			amount %= 500;
		}
		if(amount >= 100)
		{
			n100 = amount / 100;
			amount %= 100;
		}
		if(amount >= 50)
		{
			n50 = amount / 50;
			amount %= 50;
		}
		if(amount >= 20)
		{
			n20 = amount / 20;
			amount %= 20;
		}
		if(amount >= 10)
		{
			n10 = amount / 10;
			amount %= 10;
		}
		if(amount >= 5)
		{
			n5 = amount / 5;
			amount %= 5;
		}
		
		if(amount >= 2)
		{
			n2 = amount / 2;
			amount %= 2;
		}
		if(amount >= 1)
		{
			n1 = amount / 1;
			amount %= 1;
		}
		
		System.out.println("500 = " +n500+ " , 100 = "+n100+ " , 50 = "+n50+ " , 20 = "+n20 + " , 10 = "+n10 + " , 5 = "+n5+ " , 2 = "+n2 + " , 1 = "+n1);
	}
}
		