
class BubbleSort
{
	public static void main(String x[])
	{
		int[] nums = {5,3,2,1,4};
		
		System.out.println("\nArray Before Sort");
		for(int i = 0 ; i < nums.length ; i++)
		{
			System.out.print(nums[i]+" ");
		}
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j = 0 ; j < nums.length-1 ; j++)
			{	
				if(nums[j] > nums[j+1])
				{
					int temp = nums[j] ;
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println("\nArray After Sort");
		for(int i = 0 ; i < nums.length ; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}