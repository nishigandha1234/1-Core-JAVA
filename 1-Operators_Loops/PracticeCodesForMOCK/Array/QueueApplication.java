import java.util.*;
public class QueueApplication
{   static int q[]=new int[5];
    static int rear=-1,front=0;
    public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	   do{
	      System.out.println("1:INSERT");
		  System.out.println("2:DELETE");
		  System.out.println("3:Display");
		  System.out.println("Enter your choice");
		  int choice=xyz.nextInt();
		  switch(choice)
		  {
		    case 1:
			System.out.println("Enter value for storing in queue");
			int value=xyz.nextInt();
			insert(value);
			break;
			case 2:
			del();
			break;
			case 3:
			display();
			break;
			case 4:
			System.exit(0);
			break;
			default:
			   System.out.println("wrong choice");
		  }
		}while(true);  
	}
	public static void insert(int value)
	{
		if(rear == q.length-1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear+=1;
			q[rear] = value;
		}
	}
	public static void del()
	{
		if(rear == -1 &&front == 0 || front == rear+1)
		{
			System.out.println("Queue is empty");
		}
		else{
			int value = q[front];
			front += 1;
		}
	}
	public static void display()
	{
		if( (rear == -1&& front == 0) || (front == rear+1))
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i = front ; i <= rear ; i++)
			{
				System.out.println(q[i]);
			}
		}
	}
}