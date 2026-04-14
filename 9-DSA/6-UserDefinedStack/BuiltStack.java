//In-Built in Stack

import java.util.*;

class BuiltStack
{
	public static void main(String x[])
	{
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("PUSH : "); 
			System.out.println("POP : "); 
			System.out.println("DISPLAY : "); 
			System.out.println("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				System.out.println("Enter Values in Stack : ");
				int value = sc.nextInt();
				stack.push(value);
				break;
				
				case 2 :
				boolean b = stack.isEmpty();
				
				if(b)
				{
					System.out.println("Stack is Empty");
				}
				else
				{
					value = stack.pop();
					System.out.println("Removed Element is "+value);
				}
				break;
				
				case 3 :
				boolean c = stack.isEmpty();
				
				if(c)
				{
					System.out.println("Stack is Empty");
				}
				else
				{
					for(int i = stack.size()-1 ; i >= 0 ; i--)
					{
						System.out.print(stack.get(i)+" ");						
					}
				}
				break;
				
				case 4 :
				System.exit(0);
				break;
				
				default :
				System.out.println("Invalid Choice Entered...!");
				break;
			}
		}
		while(true);
	}
}