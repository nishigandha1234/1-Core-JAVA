//User Defined Queue

import java.util.*;	
class LinearQueue
{
	static int queue[] = new int[5];
	static int rear = -1, front = 0;
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("INSERT : ");
			System.out.println("DELETE : ");
			System.out.println("DISPLAY : ");
			System.out.println("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				System.out.println("Enter Values in Queue : ");
				int value = sc.nextInt();
				insert(value);
				break;
				
				case 2 :
				delete();
				break;
				
				case 3 :
				display();
				break;
				
				case 4 :
				System.exit(0);
				break;
				
				default :
				System.out.println("INVALID CHOICE ENTERED...!");
				break;
			}
		}
		while(true);
	}
	public static void insert(int value)
	{
		if(rear == (queue.length-1))
		{
			System.out.println("QUEUE IS FULL...!");
		}
		else
		{
			rear += 1;
			queue[rear] = value;
		}
	}
	public static void delete()
	{
		if( (rear == -1 && front == 0) || (front == rear+1))
		{
			System.out.println("QUEUE IS EMPTY...!");
		}
		else
		{
			int value = queue[front];
			front+=1;
			System.out.println("REMOVED ELEMENT IS : "+ value);
		}
	}
	public static void display()
	{
		if( (rear == -1 && front == 0) || (front == rear+1))
		{
			System.out.println("QUEUE IS EMPTY...!");
		}
		else
		{
			for(int i = front ; i <= rear ; i++)
			{
				System.out.print(queue[i]+" ");
				System.out.print(q
				
			}
		}
	}
}