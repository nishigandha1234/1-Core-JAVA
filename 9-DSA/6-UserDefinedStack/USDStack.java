//UserdefinedStack

import java.util.Scanner;

class USDStack
{
	static int stack[] = new int[5];
	static int top = -1;
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\n1. PUSH : ");
			System.out.println("2. POP : ");
			System.out.println("3. DISPLAY : ");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				System.out.println("Enter Values in Stack : ");
				int value = sc.nextInt();
				push(value);
				break;
				
				case 2 :
				pop();
				break;
				
				case 3 :
				display();
				break;
				
				case 4 :
				System.exit(0);
				break;
				
				default :
				System.out.println("Entered Invalid Choice..!");
				break;
			}
		}
		while(true);
	}
	public static void push(int value)
	{
		if(top == (stack.length-1))
		{
			System.out.println("STACK IS OVERFLOW...!");
		}
		else
		{
			top += 1;
			stack[top] = value;
		}
	}
	public static void pop()
	{
		if(top == -1)
		{
			System.out.println("STACK IS UNDERFLOW...!");
		}
		else{
			int value = stack[top];
			top -= 1;
			System.out.println("Remove Value is : "+value);
		}
	}
	public static void display()
	{
		if(top == -1)
		{ 
			System.out.println("STACK IS UNDERFLOW...!");
		}
		else
		{
			for(int i = top ; i >= 0 ; i--)
			{
				System.out.print(stack[i]+" ");
			}
		}
	}
}