/*9. String Compression
Input: aaabbcccc
Output: a3b2c4
*/

class StringCompression167
{
    public static void main(String x[])
    {
        String s = "aaabbcccc";

        System.out.println(stringCompress(s));
    }

    public static String stringCompress(String s)
    {
        char[] ch = s.toCharArray();

        int k = 0;
        int count = 1;

        for(int i = 0; i < ch.length; i++)
        {
            if(i < ch.length-1 && ch[i] == ch[i+1])
            {
                count++;
            }
            else
            {
                ch[k++] = ch[i];

                if(count > 1)
                {
                    String st = count + "";

                    for(
                    for(int j = 0; j < st.length(); j++)
                    {
                        ch[k++] = st.charAt(j);
                    }
                }

                count = 1;
            }
        }

        return new String(ch,0,k);
    }
}