//1047. Remove All Adjacent Duplicates In String
//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them. We repeatedly make duplicate removals on s until we no longer can. Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

import java.util.*;

class RemoveAdjDuplicate
{
	public static void main(String x[])
	{
		String s = "abbaca";
		System.out.println(removeDuplicate(s));
	}
	public static String removeDuplicate(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		
		char[] ch = s.toCharArray();
		for(int i = 0 ; i < ch.length ; i++)
		{
			boolean flag = stack.isEmpty();
			if(!flag && stack.peek() == ch[i])
			{
				stack.pop();
			}
			else
			{
				stack.push(ch[i]);
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < stack.size() ; i++)
		{
			sb.append(stack.get(i));
		}
		return sb.toString();
	}

}