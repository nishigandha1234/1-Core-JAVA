/*Q5. Given N strings, group together all strings having the same characters irrespective of order. Do not use collections or sorting methods. 
Explanation -  listen  silent  enlist  belong to same group. 
Input - Enter number of strings: 6 listen  silent  abc  cab  enlist  dog 
Output - Group 1     Group 2      Group 3 
		 Listen        abc          dog 
		 Silent        cab 
		 enlist*/
		 
import java.util.*;
class GroupsAnagramMock
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Strings : ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the Strings in Array : ");
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextLine();
		}
		boolean visit[] = new boolean[n];
		int group = 1;
		
		for(int i = 0 ; i < n ; i++)
		{
			if(visit[i])
			{
				continue;
			}
			
			System.out.println("Group : "+group+ ":");
			System.out.println(arr[i]+ " ");
			
			visit[i] = true;
			
			for(int j = i+1 ; j < n ; j++)
			{
				if(!visit[j] && isAnagram(arr[i], arr[j]))
				{
					System.out.println(arr[j]);
					visit[j] = true;
				}
			}
			System.out.println();
			group++;
		}
	}
	public static boolean isAnagram(String s1, String s2)
	{	
		if(s1.length() != s2.length())
		{
			return false;
		}
		int[] count = new int[26];
		
		for(int i = 0 ; i < s1.length() ; i++)
		{
			count[s1.charAt(i)-'a']++;
			count[s2.charAt(i)-'a']--;
		}
		for(int i = 0 ; i < 26 ; i++)
		{
			if(count[i] != 0)
			{
				return false;
			}
		}
		return true;
	}
}