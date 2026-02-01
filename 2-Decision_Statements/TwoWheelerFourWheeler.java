import java.util.*;

public class TwoWheelerFourWheeler
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Total number of vehicle (two-wheeler + four-wheeler) : ");
		int v = sc.nextInt();
		System.out.println("Total number of wheels : ");
		int w = sc.nextInt();
		
		int fw = 0, tw = 0;
		if(v <= 200 && w <= 540)
		{
			fw = (w-2*v)/2;
			tw = v-fw;
		}
		else
		{
			System.out.println("Invalid Input : ");
		}
		System.out.println("TW : " + tw);
		System.out.println("FW : " + fw);
	
		
	}
}
			