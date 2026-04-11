/*//682. Baseball Game
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.*/

import java.util.*;
class BaseballGame
{
	public static void main(String x[])
	{
		String [] operations = {"5","2","C","D","+"};
		System.out.println(calPoints(operations));
	}
	public static int calPoints(String[] operations) 
	{
		Stack<Integer> stack = new Stack<>();
		int n = operations.length;
		int sum = 0 ;
		int size = stack.size();
		for(int i = 0 ; i < n-1 ; i++)
		{
			String str = operations[i];
			
			if(!str.equals("C") && !str.equals("D") && !str.equals("+") )
			{
				stack.push(Integer.parseInt(str));
			}
			else if(str.equals("C"))
			{
				stack.pop();
			}
			else if(str.equals("D"))
			{
				stack.push(stack.peek() * 2);
			}
			else if(str.equals("+"))
			{
				stack.push(stack.get(size-1) + stack.get(size-2));
			}
		}
		for(int i = 0 ; i < stack.size() ; i++)
		{
			sum += stack.get(i);
		}
		
		return sum;
	}
}