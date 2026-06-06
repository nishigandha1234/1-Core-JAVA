/*37. String Permutations
Class Name: PermutationString
Methods:
void setString(String str)
void generatePermutation()
Example
Input:
 "ABC"
Output:
 ABC, ACB, BAC, BCA, CAB, CBA
*/

class PermutationString
{
	private String str; 
	
	void setString(String str)
	{
		this.str = str;
	}
	void findDuplicateWords()
	{
		String[] word = str.split(" ");
		for(int i = 0 ; i < word.length ; i++)
		{
			int count = 1;
			for(int j = i+1 ; j < word.length ; j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
				}				
			}
			if(count > 1)
            {
				System.out.print(word[i]+",");
            }
		}
	}
}
public class PermutationString37
{
	public static void main(String x[])
	{
		DuplicateWords r1 = new DuplicateWords();
		r1.setString("Java is easy Java is powerful");
		r1.findDuplicateWords();
	}
}
