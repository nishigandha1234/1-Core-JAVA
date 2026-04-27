/*3668. Restore Finishing Order
You are given an integer array order of length n and an integer array friends.order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
Return an array containing your friends' IDs in their finishing order.
Example 1: Input: order = [3,1,2,5,4], friends = [1,3,4] Output: [3,1,4]*/
import java.util.*;
class RestoreFinishingOrder
{
	public static void main(String x[])
	{
		int[] order = {3,1,2,5,4};
	int[]friends = {1,3,4};
		System.out.println(Arrays.toString(recoverOrder(order, friends)));
	}
	public static int[] recoverOrder(int[] order, int[] friends)
    {
        int[] ans = new int[order.length];
        int k = 0 ;
		
		for(int i = 0 ; i < order.length ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j < friends.length ; j++)
			{
				if(order[i] == friends[j])
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				ans[k++] = order[i];
			}
		}
		int[] res = new int[k];
		for(int i = 0 ; i < k ; i++)
		{
			res[i] = ans[i];
		}
		retu
		return res;
    }
}