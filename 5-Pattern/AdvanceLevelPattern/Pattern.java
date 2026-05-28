/*
A
b C
D e f 
g H i J 
K l M n O
*/
class Pattern
{
	public static void main(String x[])
	{
		char ch = 'A';
		for(int i = 1 ; i <= 5 ; i++)
		{
			boolean flag;
			if(i % 2 == 0)
				flag = false;
			else
				flag = true;
			
			for(int j = 1 ; j <= 5; j++)
			{
				if(j <= i)
				{
					if(flag)
					{
						System.out.print(ch+" ");
						flag = false;
					}
					else
					{
						System.out.print((char)(ch+32)+" ");
						flag = true;
					}
					ch++;
				}
			}
			System.out.println();
		}
	}
}