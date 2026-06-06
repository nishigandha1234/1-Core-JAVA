/*3751. Total Waviness of Numbers in Range I
You are given two integers num1 and num2 representing an inclusive range [num1, num2].The waviness of a number is defined as the total count of its peaks and valleys:A digit is a peak if it is strictly greater than both of its immediate neighbors.A digit is a valley if it is strictly less than both of its immediate neighbors.The first and last digits of a number cannot be peaks or valleys.Any number with fewer than 3 digits has a waviness of 0.
Return the total sum of waviness for all numbers in the range [num1, num2].
Example 1: Input: num1 = 120, num2 = 130 Output: 3*/

class TotalWavinessofNumbers3751
{
	public static void main(String x[])
	{
		int  num1 = 120;
		int	num2 = 130;
		System.out.println(totalWaviness(num1, num2));
	}
	public static int totalWaviness(int num1, int num2) 
	{
		int count = 0 ;
			
        while(num1 <= num2)
		{
			String s = String.valueOf(num1);
			for(int i = 1 ; i < s.length()-1 ; i++)
			{
				char prev = s.charAt(i-1);
				char mid = s.charAt(i);
				char next = s.charAt(i+1);
				
				if(mid > prev && mid > next || mid < prev && mid < next )
				{
					count++;
				}
			}
			num1++;
		}
		return count;
    }	
}