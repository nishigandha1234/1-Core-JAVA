/*37 Find common elements in two arrays */
import java.util.*;
class FindCommonElements37
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in first array : ");
		int[] nums1 = new int[4];
		for(int i = 0 ; i < nums1.length ; i++)
		{
			nums1[i] = sc.nextInt();
		}
		System.out.println("Enter elements in second array : ");
		int[] nums2 = new int[2];
		for(int i = 0 ; i < nums2.length ; i++)
		{
			nums2[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	public static int[] intersection(int[] nums1, int[] nums2) 
	{
		int[] ans = new int[nums1.length];
		int s = 0;
		
		for(int i = 0 ; i < nums1.length ; i++)
		{
			for(int j = 0 ; j < nums2.length ; j++)
			{
				if(nums1[i] == nums2[j])
				{
					boolean flag = false;
					for(int k = 0 ; k < s ; k++)
					{
						if(ans[k] == nums1[i])
						{
							flag = true;
							break;	
						}
					}
					if(flag == false)
					{
						ans[s++] = nums1[i];
					}
					break;
				}
			}
		}
		int[] result = new int[s];

        for(int i = 0; i < s; i++) {
            result[i] = ans[i];
        }
        return result;
	}
}