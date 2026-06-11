/*Question 30: Write a Java program to count words starting with vowel.
Description: Create Word class storing string. Count words starting with vowel.
INPUT: Apple Ball Orange Umbrella Cat
OUTPUT: Words starting with vowel: 3
EXPLANATION:Create Word class with String word field. Use constructor to initialize. Store 5 words in array. Loop through array, check if first character is vowel (A,E,I,O,U). Count words starting with vowel: Apple (A), Orange (O), Umbrella (U) = 3. Display count.*/

class Word
{
	private String value;
	
	Word(String value)
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
public class WordApplication30
{
	public static void main(String x[])
	{
		Word[] n = new Word[5];

		n[0] = new Word("Apple");
		n[1] = new Word("Ball");
		n[2] = new Word("Orange");
		n[3] = new Word("Umbrella");
		n[4] = new Word("Cat");
		
		int count = 0 ;
		
		for(int i = 0; i < n.length; i++)
		{
			char ch = n[i].getValue().charAt(0);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		System.out.println("Words starting with vowel: "+count);
	}
}
