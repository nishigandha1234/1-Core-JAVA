/*Example: WAP to find max value from Array 
Create class name as MaxFinder with two methods 
void setArray(int a[]): this function accept array as parameter 
int getMax(): this function finds the max value and returns it.*/

class MaxFinder
{
	int[] num;
	void setArray(int[] data)
	{
		num = data;
	}
	int getMax()
	{
		int max = num[0];
		for(int i = 0 ; i < num.length; i++)
		{
			if(num[i] > max)
				max = num[i];
		}
		return max;
	}
}
public class MaxFinderApplication
{
	public static void main(String x[])
	{
		int[] ar = new int[]{10,20,30,40,50};
		MaxFinder m1 = new MaxFinder();
		m1.setArray(ar);
		System.out.println("Max : " + m1.getMax());
	}
}