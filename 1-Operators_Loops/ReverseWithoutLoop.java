import java.util.*;

class ReverseWithoutLoop
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int rev = ((num%10)*100) + (((num/10)%10)* 10)+ (num/100);
		System.out.println(rev);
	}
}