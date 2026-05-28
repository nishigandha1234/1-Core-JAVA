/*22. Find ASCII Value Class Name: ASCIIValue 
void setCharacter(char ch)
int getASCII()
Example Input:'A' Output:65*/

class ASCIIValue
{
	private char ch;
	void setString(char ch)
	{
		this.ch = ch;
	}
	int getASCII()
	{
		return (int)ch;
	}
}
public class FindASCIIValue22
{
	public static void main(String x[])
	{
		ASCIIValue uc = new ASCIIValue();
		uc.setString('A');
		System.out.println(uc.getASCII());
	}
}