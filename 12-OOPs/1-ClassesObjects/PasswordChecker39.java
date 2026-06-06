/*39. Password Strength Checker
Class Name: PasswordChecker
Methods:
void setPassword(String password)
String checkStrength()
Description
Checks whether password is weak, medium, or strong.
Example
Input:
 "Abc@1234"
Output:
 "Strong Password"
*/

class PasswordChecker
{
    private String password;

    void setPassword(String password)
    {
        this.password = password;
    }

    String checkStrength()
    {
		boolean upper = false;
		boolean lower = false;
		boolean special = false;
		boolean digit = false;

		for(int i = 0 ; i < password.length() ; i++)
		{
			char ch = password.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')
				upper = true;
			else if(ch >= 'a' && ch <= 'z')
				lower = true;
			else if(ch >= '0' && ch <= '9')
				digit = true;
			else
				special = true;
		}
        
		if(password.length() >= 8 && special&& digit&& upper&& lower)
			return "Strong Password";
		else if(password.length() >= 6 && digit && (upper || lower))
			return "Medium Password";
		else
			return "Weak password";
    }
}

public class PasswordChecker39
{
    public static void main(String[] args)
    {
        PasswordChecker p = new PasswordChecker();

        p.setPassword("Abc@1234");

        System.out.println(p.checkStrength());
    }
}