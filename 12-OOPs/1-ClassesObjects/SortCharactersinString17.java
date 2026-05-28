/*17. Sort Characters in String, Class Name: SortString
void setString(String str)
String sortCharacters()
Description-Arrange characters alphabetically.
Example- Input: "dcba" Output: "abcd"*/
 
class SortString
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	String sortCharacters()
	{
		char arr[] = str.toCharArray();
		for(int i = 0 ; i < str.length() ; i++)
		{
			for(int j = i+1 ; j < str.length() ; j++)
			{	
				if(arr[i] > arr[j])
				{
					char temp = arr[i] ;
					arr[i]  = arr[j] ;
					arr[j]  = temp;
				}
			}
		}
		String ans = new String(arr);
		return ans;
	}
}
public class SortCharactersinString17
{
	public static void main(String x[])
	{
		SortString s = new SortString();
		s.setString("dcba");
		System.out.println(s.sortCharacters());
	}
}