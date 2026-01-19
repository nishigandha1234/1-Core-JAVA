import java.util.*;

class FindCube
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		double cube = Math.pow(num, 3);
		System.out.println(cube);
	}
}