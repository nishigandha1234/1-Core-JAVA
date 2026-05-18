/*6. Find Length Without Built-in Function (No LeetCode) 
Given a string, determine its length without using any built-in length function. Traverse the 
string manually and count the characters. 
Example: Input: "coding" → Output: 6*/

class FindLengthWithoutBuiltInFunction
{
	public static void main(String x[])
	{
		String s = "coding" ;
		System.out.println(lengthOfString(s));
	}
	public static int lengthOfString(String s)
	{
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			count++;
		}
		return count;
	}
}