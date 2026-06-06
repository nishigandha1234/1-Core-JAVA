/*40. Convert Sentence into Pig Latin
Class Name: PigLatinConverter
Methods:
void setString(String str)
String convertPigLatin()
Example
Input:
 "java"
Output:
 "avajay"
*/

class PigLatinConverter
{
    private String str;
	
    void setString(String str)
    {
        this.str = str;
    }
    String convertPigLatin()
    {
		String ans = "";
		for(int
		for(int i = 1 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			ans += ch;		
		}
		ans += str.charAt(0);
		return ans+"ay";
    }
}

public class PigLatinConverter40
{
    public static void main(String[] args)
    {
        PigLatinConverter p = new PigLatinConverter();
        p.setString("java");
        System.out.println(p.convertPigLatin());
    }
}