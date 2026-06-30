/*Q5. Write a Java program to find maximum difference such that larger element comes after smaller element. 
Input: Enter size: 7 Enter elements: 2 3 10 6 4 8 1
Output: Maximum difference is: 8 */

class MaxDifference
{	
	public static void main(String x[])
	{
		int[] ar = {2, 3, 10, 6, 4, 8, 1};
		System.out.println(findMaxDiff(ar));
	}
	public static int findMaxDiff(int[] ar)
	{
		int min = ar[0];
		int currentDiff = 0;
		int maxDiff = 0;
		
		for(int i = 1 ; i < ar.length ; i++)
		{
			currentDiff = ar[i] - min;
			
			if(currentDiff > maxDiff)
				maxDiff = currentDiff;
		}
		return maxDiff;
	}
}