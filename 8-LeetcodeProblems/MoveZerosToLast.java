//283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.Note that you must do this in-place without making a copy of the array.

class MoveZerosToLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : ");
		int ar[] = new int[5];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int index = 0;
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] != 0)
			{
				ar[index++] = ar[i];
			}
		}			
		while(index < ar.length)
		{
			ar[index++] = 0;
		}
		System.out.println("After Removing Zeros in Array : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			System.out.print(ar[i] + " ");
		}
	}
}