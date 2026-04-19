//You are given an array of integers arr and an integer target.You have to find two non-overlapping sub-arrays of arr each with a sum equal target. There can be multiple answers so you have to find an answer where the sum of the lengths of the two sub-arrays is minimum.Return the minimum sum of the lengths of the two required sub-arrays, or return -1 if you cannot find such two sub-arrays.

class MinSumOfLengths
{
	public static void main(String x[])
	{
		int[] arr = {3,2,2,4,3};
		int target = 3;
		System.out.println(minSumOfLengths(arr, target));
	}
    public static int minSumOfLengths(int[] arr, int target) 
	{
        int n = arr.length;
        int[] best = new int[n];
        Arrays.fill(best, Integer.MAX_VALUE);

        int left = 0, sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // shrink window if sum > target
            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            // found subarray
            if (sum == target) {
                int len = right - left + 1;

                // check non-overlapping
                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, len + best[left - 1]);
                }

                // update best at right
                best[right] = len;
            }

            // carry forward minimum
            if (right > 0) {
                best[right] = Math.min(best[right], best[right - 1]);
            }
        }

        return ans == Integer.MAX_VALUE
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
 