/*91. Decode Ways
You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:
However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25"). For example, "11106" can be decoded into:"AAJF" with the grouping (1, 1, 10, 6)"KJF" with the grouping (11, 10, 6)
The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
Example 1:Input: s = "12" Output: 2*/

class DecodeWays
{
	public static void main(String x[])
	{
		String  s = "12";
		System.out.println(numDecodings(s));
	}
	public static int numDecodings(String s) {

        // If first digit is 0, impossible
        if(s.length() == 0 || s.charAt(0) == '0')
            return 0;

        int prev2 = 1; // ways before previous
        int prev1 = 1; // ways till first digit

        for(int i = 1; i < s.length(); i++) {

            int curr = 0;

            // check single digit
            if(s.charAt(i) != '0') {
                curr = curr + prev1;
            }

            // check two digits
            int num = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');

            if(num >= 10 && num <= 26) {
                curr = curr + prev2;
            }

            prev2 = prev1;
            prev1 = curr;
        }
        return
        return prev1;
    }
}