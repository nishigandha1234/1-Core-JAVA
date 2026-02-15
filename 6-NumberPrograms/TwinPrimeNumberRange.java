import java.util.Scanner;

class TwinPrimeNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		for(int j =2 ; j <= n; j++)
		{
			int n1 = j; //5
			int n2 = (j+2);  //7
			
			boolean isPrime1 = true;
			boolean isPrime2 = true;
			
			if(n1<=1)
				isPrime1 = false;
			if(n2<=1)
				isPrime2 = false;
		//					2<=2 n1==isPrime1=true
			for(int i = 2 ; i<= n1/2 ; i++)
			{
				if(n1%i==0)
				{
					isPrime1 = false;
					break;
				}
			}
			//				3<=3
			for(int i = 2 ; i<= n2/2 ; i++)
			{
				//7%3==0 == iSPrime2 == true
				if(n2%i==0)
				{
					isPrime2 = false;
					break;
				}
			}
			if(isPrime1 && isPrime2 && (n2-n1==2) )
				System.out.println("("+n1 + ", " + n2 +")");
		}
	}
}