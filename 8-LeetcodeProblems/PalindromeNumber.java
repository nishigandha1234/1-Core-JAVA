//9

class PalindromeNumber {
	
	public static void main(String x[])
	{
		System.out.println(isPalindrome(10));
	}
	
    public static boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        
        // For even length: x == rev
        // For odd length: x == rev / 10
        return (x == rev || x == rev / 10);
    }
}