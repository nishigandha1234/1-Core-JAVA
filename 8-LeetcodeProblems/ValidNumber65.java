/*65. Valid Number
Given a string s, return whether s is a valid number.For example, all the following are valid numbers: "2", "0089", "-0.1", "+3.14", "4.", "-.9", "2e10", "-90E3", "3e+7", "+6e-1", "53.5e93", "-123.456e789", while the following are not valid numbers: "abc", "1a", "1e", "e3", "99e2.5", "--6", "-+3", "95a54e53".
An integer number followed by an optional exponent.A decimal number followed by an optional exponent.An integer number is defined with an optional sign '-' or '+' followed by digits.The digits are defined as one or more digits.
Example 1:Input: s = "0" Output: true*/

class ValidNumber65
{
	public static void main(String x[])
	{
		String s = "0";
		System.out.println(isNumber(s));
	}
	public static boolean isNumber(String s) 
	{
       boolean digit = false;
        boolean dot = false;
        boolean exponent = false;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                digit = true;
            }
            else if(ch == '.')
            {
                if(dot || exponent)
                    return false;
                dot = true;
            }
            else if(ch == 'e' || ch == 'E')
            {
                if(exponent || !digit)
                    return false;
                exponent = true;
                digit = false;
            }
            else if(ch == '+' || ch == '-')
            {
                if(i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            }
            else
            {
                return false;
            }
        }
        return digit;
    }
}