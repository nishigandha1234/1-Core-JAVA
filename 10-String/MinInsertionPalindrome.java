/* 88. Find the minimum number of insertions to make a string palindrome.*/

import java.util.Scanner;
class MinInsertionPalindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int left = 0;
		int right = s.length()-1;
		int count = 0;
		
		while(left < right)
		{
			if(s.charAt(left) == s.charAt(right))
			{
				left++;
				right--;
			}
			else
			{
				count++;
				left++;
			}
		}
		System.out.println("Minimum Insertion : "+ count);
	}
}