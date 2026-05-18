/*86 Print all permutations LC 46*/

class PrintPermutation86
{
	public static void main(String x[])
	{
		int[] arr = {1,2,3};

		permutation(arr, 0);
	}

	public static void permutation(int[] arr, int index)
	{
		if(index == arr.length)
		{
			for(int i = 0 ; i < arr.length ; i++)
			{
				System.out.print(arr[i] + " ");
			}

			System.out.println();

			return;
		}

		for(int i = index ; i < arr.length ; i++)
		{
			swap(arr, index, i);

			permutation(arr, index + 1);

			swap(arr, index, i);
		}
	}

	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
	
	
}