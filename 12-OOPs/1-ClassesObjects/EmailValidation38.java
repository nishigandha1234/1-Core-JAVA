/*38. Validate Email
Class Name: EmailValidation
Methods:
void setEmail(String email)
boolean isValidEmail()
Example
Input:
 "abc@gmail.com"
Output:
 true*/
 
class EmailValidation
{
	private String email; 
	
	void setEmail(String email)
	{
		this.email = email;
	}
	boolean isValidEmail()
	{
		boolean flag = false;
		if(email.contains("@") && email.contains(".com"))
		{
			flag = true;
		}
		else
		{
			flag = false;
		}
		return flag;
	}
}
public class EmailValidation38
{
	public static void main(String x[])
	{
		EmailValidation r1 = new EmailValidation();
		r1.setEmail("abc@gmail.com");
		System.out.println(r1.isValidEmail());
	}
}
