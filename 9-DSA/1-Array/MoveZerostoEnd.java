/*Q3. Write a Java program to move all zeros to the end of array without changing order of non-zero 
elements. 
Input: Enter size: 8 Enter elements: 1 0 2 0 4 0 5 3 
Output: Modified array: 1 2 4 5 3 0 0 0 */

class MoveZerostoEnd
{
	public static void main(String x[])
	{
		int[] arr= {1, 0, 2, 0, 4, 0, 5, 3};
		int pos = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] != 0)
			{
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				pos++;
			}
		}
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}