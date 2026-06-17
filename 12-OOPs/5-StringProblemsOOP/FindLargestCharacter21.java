/*21. Find the largest character in a string.*/

class FindLargestCharacter21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch1 = s.charAt(i);
			for(int j = i+1 ; j < s.length(); j++)
			{
				char ch2 = s.charAt(j);
				if((int)ch1 < int(ch2))
				{
					System.out.println(ch2);
				}
			}
		}
	}
}