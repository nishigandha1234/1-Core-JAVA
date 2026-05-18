/*Concatenate Two Strings (No LeetCode) 
Given two strings, combine them into a single string and return the result. The original order of characters must remain unchanged. 
Example: Input: "Hello", "World" → Output: "HelloWorld"*/

class ConcatenateTwoStrings
{
	public static void main(String x[])
	{
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(concatenateTwoStrings(s1,s2));
	}
	public static String concatenateTwoStrings(String s1,String s2)
	{
		return s1+s2;
	}
}