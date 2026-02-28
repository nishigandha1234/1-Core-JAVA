import java.util.*;

public class FrequencyDig
{
	public static void main(String []x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		for(int i =1 ; i<= 9 ; i++)
		{
			int temp = num;
			int count = 0;
			
			while(temp != 0)
			{
				int rem = temp % 10;
				if( rem == i )
				{
					count++;
				}
				temp/=10;
			}
			if(count > 0 )
			{
				System.out.println(i + "->" + count);
			}
		}
	}
}