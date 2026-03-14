class Q27FrequencyOfElement
{
	 public static void main(String x[])
	{
	    int a[]=new int[]{10,10,10,20,20,30,30,30,40,40,40};
		int count=1,i=0; 
		for(i=1; i<a.length; i++)
		{      
			if(a[i-1]==a[i])
			{
				++count;
			}
			else{
				System.out.println(a[i-1]+"--->"+count);
				count=1;
			}
		}
		System.out.println(a[i-1]+"--->"+count);
	}

}