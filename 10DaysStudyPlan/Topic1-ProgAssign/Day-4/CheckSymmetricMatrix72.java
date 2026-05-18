/*72 Check symmetric matrix LC 867*/

class CheckSymmetricMatrix72
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,2,3},	
					{2,0,4},
					{3,4,5}
					};
		boolean flag = true;
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = i+1; j < ar.length ; j++)
			{
				if(ar[i][j] != ar[j][i])
				{
					flag = false;
					break;
				}
			}
			if(!flag) break;
		}
		System.out.println(flag ? "Symmetry Matrix" :"NOT Symmetry Matrix" );
	}
}