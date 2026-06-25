/*89. Find the minimum number of deletions to make a string palindrome.*/

class MinDeletionsPalindrome
{
    public static void main(String args[])
    {
        String s = "abcda";

        int left = 0;
        int right = s.length() - 1;
        int count = 0;

        while(left < right)
        {
            if(s.charA
            if(s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                count++;
                right--;
            }
        }

        System.out.println("Minimum Deletions = " + count);
    }
}