import java.util.Scanner;

class NumberProgramsUsingSwitch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice from Below : ");
		
		System.out.println("1. Harshad Number : ");
		System.out.println("2. Automorphic Number : ");
		System.out.println("3. Happy Number : ");
		System.out.println("4. Armstrong Number : ");
		System.out.println("5. Strong Number : ");
		System.out.println("6. Neon Number : ");
		System.out.println("7. Pronic Number : ");
		System.out.println("8. Perfect Number : ");
		System.out.println("9. Duck Number : ");
		System.out.println("10.Spy Number : ");
		System.out.println("11.Prime Number : ");
		System.out.println("12.Kaprekar Number : ");
		System.out.println("13.Disarium Number : ");
		System.out.println("14.Abundant Number : ");
		System.out.println("15.Krishnamurthy  Number : ");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 :
			{
				System.out.println("Welcome to Harshad Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt();
				int sum= 0;
				int temp = num;
				for(int i = 1 ; i < num ; i++)
				{
					while(temp != 0)
					{
						int rem = temp%10;
						sum+=rem;
						temp/=10;
					}
				}
				if(num%sum == 0) System.out.println("Harshad Number");
				else System.out.println("NOT Harshad Number");
				break;
			}
			case 2 :
			{
				System.out.println("Welcome to Automorphic Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt(); //5
				int square = num*num; //25  
				int temp = num;
				
				while(square != 0)
				{
					if(temp%10 == square%10)
					{
						System.out.println("Automorphic Number");
						return;
					}
					temp/=10;
					square/=10;
				}
				System.out.println("NOT Automorphic Number");
				break;
			}
			case 3 :
			{
				System.out.println("Welcome to Happy Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt(); //19 =
				int square = num*num; //25  
				int temp = num;
				
				while(temp != 1 && temp != 4) //19 = 
				{
					int sum = 0;
					while(temp != 0)
					{
						int rem = temp%10;
						sum+=rem*rem;
						temp/=10;
					}
					temp = sum;
				}
				if(temp ==1) System.out.println("Happy Number");
				else 		 System.out.println("NOT Happy Number");
				break;
			}
			case 4 : 
			{
				System.out.println("Welcome to Armstrong Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt(); //153
				int sum = 0;
				int temp = num;
				int count = 0;
				
				while(temp != 0) 
				{
					count++; //3
					temp/=10;
				}
				
				temp = num;
				while(temp != 0) 
				{
					int rem = temp%10;
					int pow = 1;
					for(int i = 1 ; i <= count ; i++)
					{
						pow *= rem;
					}
					sum += pow;
					temp/=10;
				}
				if(sum == num) System.out.println("Armstrong Number");
				else System.out.println("NOT Armstrong Number");
				break;
			}
			case 5 : 
			{
				System.out.println("Welcome to Strong Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt(); //145
				int sum = 0;
				int temp = num;
			
				while(temp != 0) 
				{
					int rem = temp%10;
					int fact = 1;
					for(int i = 1 ; i <= rem ; i++)
					{
						fact *= i;
					}
					sum += fact; 
					temp/=10;
				}
				if(sum == num) System.out.println("Strong Number");
				else System.out.println("NOT Strong Number");
				break;
			}
			case 6 : 
			{
				System.out.println("Welcome to Neon Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt(); //9
				int square= num*num; //81
				int sum = 0;
				
				while(square != 0) 
				{
					int rem = square%10;
					sum += rem; 
					square/=10;
				}
				if(sum == num) System.out.println("Neon Number");
				else System.out.println("NOT Neon Number");
				break;
			}
			case 7 : 
			{
				System.out.println("Welcome to Pronic Number : ");
				System.out.println("Enter the Range : ");
				int n = sc.nextInt(); 
				for(int i = 0 ; i <= n ; i++)
				{
					int ans = i*(i+1);
					System.out.print(ans+" ");
				}
				break;
			}
			case 8 : 
			{
				System.out.println("Welcome to Perfect Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt(); //6
				int sum = 0; 
				for(int i = 1 ; i < num ; i++)
				{
					if(num%i == 0)
					{
						sum+=i;
					}
				}
				if(sum == num) System.out.println("Perfect Number");
				else System.out.println("NOT Perfect Number");
				break;
			}
			case 9 : 
			{
				System.out.println("Welcome to Duck Number : ");
				System.out.println("Enter the Number : "); 
				int num = sc.nextInt(); //1034
				int temp = num;
				boolean flag = false;
				while(temp != 0) //10
				{
					if(temp%10 == 0)
					{
						flag = true;
						break;
					}
					temp/=10;
				}
				if(flag) System.out.println("Duck Number");
				else System.out.println("NOT Duck Number");
				break;
			}
			case 10 : 
			{
				System.out.println("Welcome to Spy Number : "); 
				System.out.println("Enter the Number : "); 
				int num = sc.nextInt(); //1124
				int temp = num;
				int sum = 0, prod = 1;
				while(temp != 0) //1124
				{			
					int rem = temp%10;
					sum += rem;
					prod *= rem;
					temp/=10;
				}
				if(sum == prod) System.out.println("Spy Number");
				else System.out.println("NOT Spy Number");
				break;
			}
			case 11 : 
			{
				System.out.println("Welcome to Prime Number : "); 
				System.out.println("Enter the Number : "); 
				int num = sc.nextInt(); 
				boolean flag = true;
				for(int i = 2 ; i < num ; i++) 
				{			
					if(num % i == 0)
					{
						flag = false;
						break;
					}
				}
				if(flag) System.out.println("Prime Number");
				else System.out.println("NOT Prime Number");
				break;
			}
			case 12 : 
			{
				System.out.println("Welcome to Kaprekar Number : "); 
				System.out.println("Enter the Number : ");  
				int num = sc.nextInt(); //297
				int square = num*num; //88209
				int count = 0;
				int temp = num;
				
				while(temp != 0)
				{
					count++; //3
					temp/=10; 
				}
				int pow =1;
				for(int i = 1 ; i <= count ; i++) 
				{			
					pow*=10; //1000
				}
				
				int fhalf = square/pow; //88
				int shalf = square%pow; //209
	
				int sum = fhalf+shalf;
				System.out.println(sum == num ? "Kaprekar Number" : "NOT Kaprekar Number");
				break;
			}
			case 13 : 
			{
				System.out.println("Welcome to Disarium Number : "); 
				System.out.println("Enter the Number : ");  
				int num = sc.nextInt(); //135
				int temp = num;
				int count = 0;
				while(temp != 0)
				{
					count++; //3
					temp/=10; 
				}
				
				temp = num; //temp =135
				int sum = 0;
				while(count != 0) //2!=0
				{
					int pow = 1;
					int rem = temp%10; 
					for(int j = 1 ; j <= count ; j++)
					{
						pow*=rem; //125, 9 ,1
					}
					sum+=pow; // 135
					count--;
					temp/=10;
				}
				System.out.println(sum == num ? "Disarium Number" : "NOT Disarium Number");
				break;
			}
			case 14 : 
			{
				System.out.println("Welcome to Abundant Number : "); 
				System.out.println("Enter the Number : ");  
				int num = sc.nextInt(); //12
				int sum = 0;
				for(int i = 1; i < num ; i++)
				{
					if(num%i==0)
					{
						sum+=i;
					}
				}
				System.out.println(sum > num ? "Abundant Number" : "NOT Abundant Number");
				break;
			}
			case 14 : 
			{
				System.out.println("Welcome to Abundant Number : "); 
				System.out.println("Enter the Number : ");  
				int num = sc.nextInt(); //12
				int sum = 0;
				for(int i = 1; i < num ; i++)
				{
					if(num%i==0)
					{
						sum+=i;
					}
				}
				System.out.println(sum > num ? "Abundant Number" : "NOT Abundant Number");
				break;
			}	
			case 15 : 
			{
				System.out.println("Welcome to Krishnamurthy Number : "); 
				System.out.println("Enter the Number : ");  
				int num = sc.nextInt(); //12
				int sum = 0;
				for(int i = 1; i < num ; i++)
				{
					if(num%i==0)
					{
						sum+=i;
					}
				}
				System.out.println(sum > num ? "Abundant Number" : "NOT Abundant Number");
				break;
			}	
		}
	}
}