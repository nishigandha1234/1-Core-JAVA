/*1592. Rearrange Spaces Between Words
You are given a string text of words that are placed among some number of spaces. Each word consists of one or more lowercase English letters and are separated by at least one space. It's guaranteed that text contains at least one word.Rearrange the spaces so that there is an equal number of spaces between every pair of adjacent words and that number is maximized. If you cannot redistribute all the spaces equally, place the extra spaces at the end, meaning the returned string should be the same length as text.Return the string after rearranging the spaces.
Example 1: Input: text = "  this   is  a sentence " Output: "this   is   a   sentence"
Explanation: There are a total of 9 spaces and 4 words. We can evenly divide the 9 spaces between the words: 9 / (4-1) = 3 spaces.*/

class RearrangeSpacesBetweenWords
{
	public static void main(String x[])
	{
		String text = "  this   is  a sentence ";
		System.out.println(reorderSpaces(text));
	}
	public static String reorderSpaces(String text) 
	{
        int spaceCount = 0, wordCount = 0;

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) != ' ' && (i == 0 || text.charAt(i-1) == ' '))
            {
                wordCount++;
            }

            if(text.charAt(i) == ' ')
            {
                spaceCount++;
            }
        }

        int s = 0;
        int extra = 0;

        if(wordCount == 1)
        {
            s = 0;
            extra = spaceCount;
        }
        else
        {
            s = spaceCount / (wordCount - 1);
            extra = spaceCount % (wordCount - 1);
        }

        String ans = "";
        String word = "";
        int usedWords = 0;

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if(ch != ' ')
            {
                word += ch;
            }
            else
            {
                if(word.length() > 0)
                {
                    ans += word;
                    usedWords++;

                    if(usedWords < wordCount)
                    {
                        for(int j = 1; j <= s; j++)
                        {
                            ans += " ";
                        }
                    }

                    word = "";
                }
            }
        }

        if(word.length() > 0)
        {
            ans += word;
        }

        for(int i = 1; i <= extra; i++)
        {
            ans += " ";
        }

        return ans;

    }
}