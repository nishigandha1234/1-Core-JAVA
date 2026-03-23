//349. Intersection of Two Arrays
//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

class IntersectionArray
{
	public static void main(String x[])
	{
		int[] nums1 = {1,2,2,3,4};
		int[] nums2 = {1,2};	
		System.out.println(intersection(nums1,nums2));
	}
	public static int[] intersection(int[] nums1, int[] nums2)
	{
		int[] ans = new int[nums1.leng
		int[] ans = new int[nums1.length];
		int k = 0 ;
		for(int i = 0 ; i < nums1.length ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j < nums2.length ; j++)
			{
				if(nums1[i] == nums2[j])
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				ans[k++] = nums1[i];
			}
		}
	}
}