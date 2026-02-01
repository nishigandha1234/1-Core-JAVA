import java.util.*;

public class TVApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the XX Volume : ");
		int xx = sc.nextInt();
		System.out.println();
		System.out.print("Enter the YY Volume : ");
		int yy = sc.nextInt();
		
		if(xx < yy)
			System.out.println("Chef press the volume up button "+(yy-xx)+" times to increase the volume from "+xx+ " to " + yy);
		else if(yy < xx)
			System.out.println("Chef press the volume up button "+(xx-yy)+" times to increase the volume from "+ yy + " to " + xx);
		else	
			System.out.println("Chef press the volume up button is same");
	}
}