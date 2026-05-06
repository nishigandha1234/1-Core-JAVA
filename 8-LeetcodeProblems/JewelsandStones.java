/*771. Jewels and Stones
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.Letters are case sensitive, so "a" is considered a different type of stone from "A".
Example 1: Input: jewels = "aA", stones = "aAAbbbb" Output: 3*/

class JewelsandStones
{
	public static void main(String x[])
	{
		String jewels = "aA", stones = "aAAbbbb";
		System.out.println(numJewelsInStones(jewels, stones));		
	}
	public static int numJewelsInStones(String jewels, String stones) 
	{
		int count = 0;
		for(int i = 0 ; i < jewels.length() ; i++)
		{
			char ch = jewels.charAt(i);
			for(int j = 0 ; j < stones.length() ; j++)
			{
				char ch1 = stones.charAt(j);
				
				if(ch == ch1)
				{
					count++;
				}
			}
		}
		return count;        
    }
}