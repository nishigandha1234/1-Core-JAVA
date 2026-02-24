import java.util.Scanner;

class DissariumNumber
{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int count = 0 , temp = num, sum = 0;
		
		temp = num;
		while(temp!=0)
		{
			count++;
			temp/=10;
		}
		temp = num;
		
		while(temp!=0)
		{
			int rem = temp%10;
			int pow =1 ;
			for(int i = 1; i <= count ;i++)
			{
				pow*=rem;
			}
			sum+=pow;
			temp/=10;
			count--;
		}
		System.out.println(sum==num? "DissariumNumber" : "Not DissariumNumber");
    }
}