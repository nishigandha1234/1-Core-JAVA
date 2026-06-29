/*Q4. Write a Java program to find subarray whose sum equals given number. 
Input: Enter size:8 Enter elements:1 4 20 3 10 5 6 2 Enter sum: 33 
Output: Subarray found from index 2 to 4 */

class MaxSubarraySum
{
	public static void main(String x[])
	{
		int[] arr = {1, 4, 20, 3, 10, 5, 6, 2};
		int sum = 33;
		
		boolean flag = false;
		for(int i = 0 ; i < arr.length ; i++)
		{
			int cSum = 0 ;
			for(int j = i ; j < arr.length ; j++)
			{
				cSum += arr[j];
				
				if(cSum == sum)
				{
					System.out.println("Index found at "+i+" to "+j);
					flag = true;
					break;
				}
			}
			if(flag)
				break;
		}
		if(flag == false)
				System.out.println("Subarray not found");
			
	}

}