/*1. Frequency of Each Character*/

class FrequencyOfChar161
{
	public static void main(String x[])
	{
		String s = "banana";
		char[] str = s.toCharArray();
		for(int i = 0 ; i < str.length ; i++)
		{
			int count = 1;
			
			if(str[i] == ' ')
					continue;
				
			for(int j = i+1 ; j < str.length ; j++)
			{
				if(str[i] == str[j])
				{
					count++;
					str[j] = ' ';
				}
			}
			if(count >= 1)
				System.out.println(str[i] +"="+ count);
		}
	}
}