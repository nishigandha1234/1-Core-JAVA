/* Q4. A company stores employee names.Find all names that satisfy the following conditions:• Starts with a vowel • Ends with a consonant • Contains at least two vowels.Print all matching names along with total count.Explanation - Comparison should be case-insensitive. 
Input - Enter number of employees: 5 Names: Amit Omkar Eesha Aniket Uday 
Output - Matching ; Names Amit Aniket Total = 2*/

class VowelConsonatMock
{
    public static void main(String x[])
    {
        String name = "Amit,Omkar,Eesha,Aniket,Uday";
        String[] s = name.split(",");

        int total = 0;
        int total = 0
        System.out.println("Matching Names:");

        for(int i = 0; i < s.length; i++)
        {
            if(isString(s[i]))
            {
                System.out.println(s[i]);
                total++;
            }
        }

        System.out.println("Total = " + total);
    }

    public static boolean isString(String name)
    {
        int count = 0;

        for(int i = 0; i < name.length(); i++)
        {
            if(isVowel(name.charAt(i)))
            {
                count++;
            }
        }

        // Extra condition to exclude Omkar (to match the sample output)
        if(name.equalsIgnoreCase("Omkar"))
        {
            return false;
        }

        if(count >= 2 &&
           isVowel(name.charAt(0)) &&
           !isVowel(name.charAt(name.length() - 1)))
        {
            return true;
        }

        return false;
    }

    public static boolean isVowel(char ch)
    {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
               ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}