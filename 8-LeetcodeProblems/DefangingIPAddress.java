//1108. Defanging an IP Address
//Given a valid (IPv4) IP address, return a defanged version of that IP address.A defanged IP address replaces every period "." with "[.]".
//Example 1: Input: address = "1.1.1.1" Output: "1[.]1[.]1[.]1"

class DefangingIPAddress
{
	public static void main(String x[])
	{
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
	}
	public static String defangIPaddr(String address)
	{
		String ans = "";
        for(int i = 0 ; i < address.length(); i++)
		{
			char ch = address.charAt(i);
			if(ch == '.')
			{
				ans += "["+ch+"]";
			}
			else
			{
				ans += ch;
			}
		}
		return ans;
    }
}