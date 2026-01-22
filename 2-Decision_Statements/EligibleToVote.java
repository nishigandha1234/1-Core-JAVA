import java.util.*;

public class EligibleToVote
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age >= 18) System.out.println("ELigible to vote");
		else System.out.println("Not Eligible To Vote");
	}
}