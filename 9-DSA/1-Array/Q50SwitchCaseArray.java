import java.util.Scanner;

class Q50SwitchCaseArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int [] a = {5732, 8659, 2534, 9625, 7354, 1325};
		System.out.println("Enter the Case from Below : ");
		System.out.println("CASE 1 : Sort Number In Ascending Order.");
		System.out.println("CASE 2 : Sort Number In Descending Order.");
		System.out.println("CASE 3 : Store sum of digits at same index.");
		System.out.println("CASE 4 : Store the even number at the first and odd at the last.");
		
		System.out.println("Enter Your Choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 :
			{
				System.out.println("WELCOME to Sort Number In Ascending Order...!");
				for(int i = 0 ; i < a.length ; i++)
				{
					int min_index = i;
					for(int j = i+1 ; j < a.length ; j++)
					{
						if(a[j] < a[min_index])
						{
							min_index = j;
						}
					}
					int temp = a[i];
					a[i] = a[min_index];
					a[min_index] = temp;
				}
				
				for(int i = 0 ; i < a.length ; i++)
				{
					System.out.print(a[i] + " ");
				}
				break;
			}	
			case 2 : 
			{
				System.out.println("WELCOME to Sort Number In Descending Order...!");
				break;
			}
			case 3 : 
			{
				System.out.println("WELCOME to Store sum of digits at same index...!");
				break;
			}
			case 4 :
			{
				System.out.println("WELCOME to Store the even number at the first and odd at Last...!");
				break;
			}
		}
	}
}