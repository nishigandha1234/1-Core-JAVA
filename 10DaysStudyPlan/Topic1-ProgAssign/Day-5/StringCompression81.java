/*443. String Compression
Given an array of characters chars, compress it using the following algorithm:Begin with an empty string s. For each group of consecutive repeating characters in chars:If the group's length is 1, append the character to s.Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.After you are done modifying the input array, return the new length of the array.You must write an algorithm that uses only constant extra space.Note: The characters in the array beyond the returned length do not matter and should be ignored.
Example 1:Input: chars = ["a","a","b","b","c","c","c"] Output: 6*/

class StringCompression81
{
	public static void main(String x[])
	{
		char[] chars = {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));
	}
	public static int compress(char[] chars) 
	{
		 int count = 1;
        int k = 0;

        for(int i = 0 ; i < chars.length ; i++)
        {
            if(i < chars.length-1 && chars[i] == chars[i+1])
            {
                count++;
            }
            else
            {
                chars[k++] = chars[i];

                if(count > 1)
                {
                    String s = count + "";

                    for(int j = 0 ; j < s.length() ; j++)
                    {
                        chars[k++] = s.charAt(j);
                    }
                } 

                count = 1;
            }
        }

        return k;
    }
}