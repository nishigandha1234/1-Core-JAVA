//1394. Find Lucky Integer in an Array
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.Return the largest lucky integer in the array. If there is no lucky integer return -1.

class LuckyNumber
{
	public static void main(String x[])
	{
		int[] arr = {1,2,2,3,3,3};
		System.out.println(findLucky(arr));
	}
	public static int findLucky(int[] arr)
	{
		int luckyNum = -1;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count == arr[i])
			{
				luckyNum = Math.max(luckyNum, arr[i]);
			}
		}
		return luckyNu
		return luckyNum;
	}
}