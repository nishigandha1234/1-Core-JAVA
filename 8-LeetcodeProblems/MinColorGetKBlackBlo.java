/*2379. Minimum Recolors to Get K Consecutive Black Blocks
You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.
In one operation, you can recolor a white block such that it becomes a black block.
Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
Example 1:Input: blocks = "WBBWWBBWBW", k = 7 Output: 3*/

class MinColorGetKBlackBlo
{
	public static void main(String x[])
	{
		String blocks = "WBBWWBBWBW";
		int	k = 7;
		System.out.println(minimumRecolors(blocks, k));
	}
	public static int minimumRecolors(String blocks, int k) 
	{
		int countW = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < k ; i++)
		{
			if("W".indexOf(blocks.charAt(i)) != -1)
			{
				countW++;
			}
		}
        min = countW;
		
		for(int i = k ; i < blocks.length() ; i++)
		{
			if("W".indexOf(blocks.charAt(i)) != -1)
			{
				countW++;
			}
			if("W".indexOf(blocks.charAt(i-k)) != -1)
			{
				countW--;
			}
			min = Math.min(min, countW);
		}
		return min;
    }
}