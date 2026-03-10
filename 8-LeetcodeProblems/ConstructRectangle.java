//492. Construct the Rectangle
//A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements

class ConstructRectangle
{
	public static void main(String x[])
	{
		System.out.println(Arrays.toString(constructRectangle(37)));
	}
	public static int[] constructRectangle(int area) 
	{
		int w = (int)Math.sqrt(area);
		while(area%w != 0)
		{
			w--;
		}
		int l = area/w;
		return new int[] {l,w};
	}
}