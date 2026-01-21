import java.util.*;

public class DetermineBonusOnRating
{
	public static void main(String[] x)
	{
		Scanner sc= new Scanner(System.in);
		int rating = sc.nextInt();
		
		System.out.println(rating > 8 ? "15% Bonus" : "No 15% Bonus");
	}
}