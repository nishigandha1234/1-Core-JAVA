
class AnagramThirdLogic
{
	public static void main(String s[])
	{
		String s1 = "listen";
		String s2 = "silent";
		isAnagram(s1,s2);
	}
	public static void isAnagram(String s1, String s2)
	{
		if(s1.length() != s2.length() )
		{
			System.out.println("NOT ANAGRAM STRINGS");;
		}
		int[] count = new int[256];
		for(int i = 0 ; i < s1.length() ; i++)
		{
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		boolean flag = true;
		for(int i = 0 ; i
		for(int i = 0 ; i < count.length ; i++)
		{
			if(count[i] != 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Anagarm");
		}
		else
		{
			System.out.println("NOT Anagarm");
		}
	}
	

}