import java.util.*;

class ConvertSecTOHrMin
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Seconds : ");
		int totSeconds = sc.nextInt();
		
		int hours = totSeconds / 3600;
		
		
		int remSec = totSeconds % 3600;
		
		int minutes = remSec / 60;
		
		int seconds = remSec % 60;
		System.out.println("Hours : " + hours);
		System.out.println("Minutes : " + minutes);
		System.out.println("Seconds : " + seconds);
	}
}