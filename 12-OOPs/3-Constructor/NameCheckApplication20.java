/*Question 20: Write a Java program to check palindrome names using constructor objects.
Description: Create NameCheck class storing a name using constructor. Store multiple names and check which names are palindrome.
INPUT:
Enter names: NITIN AMIT MADAM RAHUL
OUTPUT: Palindrome Names: NITIN MADAM*/

class NameCheck
{
	private String value;
	
	NameCheck(String value)
	{
		this.value = value;
	}
	public void setValue(String value)
	{
		this.value = value;
	}
	public String getValue()
	{
		return value;
	}
}
public class NameCheckApplication20
{
	public static void main(String x[])
	{
		NameCheck[] n = new NameCheck[4];

		n[0] = new NameCheck("NITIN");
		n[1] = new NameCheck("AMIT");
		n[2] = new NameCheck("MADAM");
		n[3] = new NameCheck("RAHUL");
		
		System.out.println("Palindrome Names:");
		
		for(int i = 0; i < n.length; i++)
		{
			String str = n[i].getValue();
			String rev = "";
		
			for(int j = str.length() - 1; j >= 0; j--)
			{
				rev += str.charAt(j);
			}
		
			if(str.equals(rev))
			{
				System.out.println(str);
			}
		}
	}
}
