class Pattern41
{
	public static void main(String x[])
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
            if(i==1 || i==5)
                System.out.println("1");
            else if(i==2 || i==4)
                System.out.println("3 3");
            else
               System.out.println("5 5 5 5 5");
		}
	}
}
