import java.util.Scanner;

public class SwapFirstLast
{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any Number");
	 int no=sc.nextInt();//122356
	 //find out number digit or convert 1 into like 10,100,10000
	 int k=1;
	 int temp=no;
	 
	 do
	 {
	    k=k*10;//ten format number
		temp=temp/10;
	 }
	 while(temp>9);
	 //here extract only first and last digit
	 int last=no%10;
	 int first=no/k;
	 //here we need to remove first and last digits
	 no=no%k;
	 no=no/10;
	 int finalnum=last*k+no*10+first;
	 System.out.println("After Swapping : "+finalnum);
   }
 } 