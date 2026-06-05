import java.util.*;
class PushStack
{
	static int[] stack = new int[5];
	static int top = -1;
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("1:PUSH");
			System.out.println("2:POP");
			System.out.println("3:DISPLAY");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Enter value in stack");
				int value=sc.nextInt();
				push(value);
				break;
				case 2:
				pop();
				break;
				case 3:
				display();
				break;
				case 4:
				System.exit(0);
				default:
				System.out.println("Wrong choice");
			}
		}
		while(true);
	}
	public static void push(int value)
	{
		if(top == stack.length-1)
		{
			System.out.println("Stack is Overflow");
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
			System.out.println("Stack is underflow");
		}
		else
		{
			int value = stack[top];
			top -= 1;
			System.out.println("Removed value : "+ value);
		}
	}
	public static void display()
	{
		if(top == -1)
		{
			System.out.println("Stack is underflow");
		}
		else
		{
			for(int i = stack.length-1 ; i >= 0 ; i--)
			{
				System.out.print(i+ " ");
			}
		}
	}
}
