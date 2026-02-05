import java.util.*;

public class EvenBetn100
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Between 1 to 100 : ");
		int i = 2;
		while(i <= 100)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
			}
			i++;
		}
	}
}