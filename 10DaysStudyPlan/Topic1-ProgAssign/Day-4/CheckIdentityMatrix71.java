/*71 Check identity matrix LC 1572*/

class CheckIdentityMatrix71
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,0,0},	
					{0,1,0},
					{0,0,1}
					};
		boolean flag = true;
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[0].length ; j++)
			{
				if(i == j)
				{
					if(ar[i][j] != 1)
					{
						flag = false;
						break;
					}
				}
				else			
				{						
					if(ar[i][j] != 0)
					{							
						flag = false;
						break;
					}
				}
			}
			if(!flag) break;
		}
		System.out.println(flag ? "Identity Matrix" :"NOT Identity Matrix" );
	}
}