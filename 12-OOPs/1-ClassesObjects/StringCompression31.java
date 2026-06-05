/*31. String Compression
Class Name: StringCompression
Methods:
void setString(String str)
String compress()
Description
Compress repeated characters.
Example
Input:
 "aaabbcc"
Output:
 "a3b2c2"
*/

class StringCompression
{
	private String str; 
	
	void setString(String str)
	{
		this.str = str;
	}
	String compress()
	{
		int count = 1;
		int k = 0 ;
		
		char[] ch = str.toCharArray();
		for(int i = 0 ; i < ch.length ; i++)
		{
			if(i < ch.length-1 && ch[i] == ch[i+1] )
			{
				count++;
			}
			else
			{
				ch[k++] = ch[i];
				
				if(count > 1)
				{
					String ans = count + "";
					for(int j = 0 ; j < ans.length() ; j++)
					{
						ch[k++] = ans.charAt(j);
					}
				}
				count = 1;
			}
		}
		char[] temp = new char[k];
		
		for(int i = 0 ; i < k ; i++)
		{
			temp[i] = ch[i];
		}
		
		String s = new String(temp);
		return s;
	}
}
public class StringCompression31
{
	public static void main(String x[])
	{
		StringCompression r1 = new StringCompression();
		r1.setString("aaabbcc");
		System.out.println(r1.compress());
	}
}

