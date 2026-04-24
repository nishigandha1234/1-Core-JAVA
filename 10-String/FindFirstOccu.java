//28. Find the Index of the First Occurrence in a String
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class FindFirstOccu 
{
	public static void main(String x[])
	{
		String haystack = "sadbutsad";
		String needle = "sad";
		System.out.println(strStr(haystack,needle));
	}
    public static int strStr(String haystack, String needle)
    {
        char[] ch = haystack.toCharArray(); 
        char[] need = needle.toCharArray();
       
        for(int i = 0 ; i <= ch.length-need.length ; i++)
        {
            boolean flag = true;
            for(int j = 0 ; j < need.length ; j++)
            {
                if(ch[i+j] != need[j])
                {
                    flag = false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
    }
}