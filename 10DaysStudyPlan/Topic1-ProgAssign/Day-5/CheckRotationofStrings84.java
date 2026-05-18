/*84 Check rotation of strings LC 796*/

class CheckRotationofStrings84
{
	public static void main(String x[])
	{
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(rotateString(s,goal));
	}
	public static boolean rotateString(String s, String goal) {
        if(s.length() == goal.length() && (s+s).contains(goal))
		{	
			return true;
		}
		return false;
    }
}