/*1491. Average Salary Excluding the Minimum and Maximum Salary
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
Example 1: Input: salary = [4000,3000,1000,2000] Output: 2500.00000*/

class AvgSalExcludingMinMaxSalary24
{	
	public static void main(String x[])
	{
		int[] salary = {4000,3000,1000,2000};
		System.out.println(average(salary));
	}
	public static double average(int[] salary) 
	{
		int min = salary[0] , max = salary[0];
		int sum = 0, count = 0;
		
		for(int i = 0 ; i < salary.length ; i++)
		{
			if(salary[i] < min)
				min = salary[i];
			if(salary[i] > max)
				max = salary[i];
		}
		
		for(int i = 0 ; i < salary.length; i++)
		{
			if(salary[i] != min && salary[i] != max){
				count++;
				sum += salary[i];
			}
		}
		return sum/count;
    }
}