import java.util.*;

public class JustCheck
{
	public static void main(String x[])
	{
		int b = 7;
		if(--b == 6)
			if(b++ == 6)
				switch(b) {
					case 6: System.out.println("Six"); break;
					case 7: System.out.println("Seven"); break;
					default: System.out.println("Default");
					}
			else
				System.out.println("Fail");
		else
			System.out.println("End");
	}
}