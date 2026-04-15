//Circular Queue

import java.util.*;

class CircularQueue
{
	static int[] queue = new int[6];
	static int rear = -1 , front = -1 ;
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\nINSERT : "); 
			System.out.println("DELETE : "); 
			System.out.println("DISPLAY : "); 
			System.out.println("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				System.out.println("Enter Values in Stack : ");
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
				System.out.println("Invalid Choice Entered...!");
				break;
			}
		}
		while(true);
	}
	
	public static void insert(int value)
	{
		if( (rear+1) % queue.length == front )
		{
			System.out.println("Queue Is Full...!");
		}
		else
		{
			if(front == -1)
			{
				front = 0;
			}
			rear = (rear+1)%queue.length;
			queue[rear] = value;
		}
	}
	public static void delete()
	{
		if(front == -1 )
		{
			System.out.println("Queue Is Empty...!");
		}
		else
		{
			int value = queue[rear];
			System.out.println("Removed Value is : "+ value);
			if(front == rear)
			{
				System.out.println("Queue is Empty...!");
				front=rear=-1;
			}
			else{
				front = (front+1)%queue.length;
			}
		}
	}
	public static void display()
	{
		if(front == -1 )
		{
			System.out.println("Queue Is Empty...!");
		}
		else
		{
			int i = front;
			while(true)
			{
				System.out.print(queue[i]+" ");
				if(i == rear)
				{
					break;
				}
				i = (i+1) % queue.length;
			}
		}
	}
}