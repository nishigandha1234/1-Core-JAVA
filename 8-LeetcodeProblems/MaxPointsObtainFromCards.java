/*1423. Maximum Points You Can Obtain from Cards
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.Your score is the sum of the points of the cards you have taken.Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
Example 1:Input: cardPoints = [1,2,3,4,5,6,1], k = 3 Output: 12 (1+6+5 last 3)*/

class MaxPointsObtainFromCards
{
	public static void main(String x[])
	{
		int[] cardPoints = {1,2,3,4,5,6,1};
		int	k = 3;
		System.out.println(maxScore(cardPoints,k));
		
	}
	public static int maxScore(int[] cardPoints, int k) 
	{	
		int max = 0;
		
		for(int i = 0 ; i <= k ; i++)
		{
			int sum = 0 ;
			for(int j = 0 ; j < i ; j++)
			{
				sum += cardPoints[j];
			}
			for(int j = cardPoints.length-(k-i) ; j < cardPoints.length ; j++)
			{
				sum += cardPoints
				sum += cardPoints[j];
			}
			if(sum > max)
			{
				max = sum;
			}
		}
		return max;
    }
}
