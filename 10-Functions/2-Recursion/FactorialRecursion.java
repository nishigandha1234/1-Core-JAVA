
class FactorialRecursion
{
	static int fact =1 ;
	public static void main(String x[])
	{
		fact(5);
	}
	public static void fact(int no)
	{
		
		if(no != 0)
		{
			fact *= no;
			no--;
			fact(no);
		}
		else{
			 System.out.println("Factorial  "+fact);
			 System.out.println("Factorial  "+fact);
		}
	}
}