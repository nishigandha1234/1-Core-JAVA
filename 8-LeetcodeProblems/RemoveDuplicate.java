//26
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

class RemoveDuplicate
{
    public static void main(String[] args) 
	{
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
		
        System.out.println("Unique Count: " + k);
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) 
	{
        if(nums.length == 0) return 0;

        int k = 1;
		for(int i = 1 ; i < nums.length ; i++)
		{
			if(nums[i] != nums[i-1])
			{
				nums[k++] = nums[i] ;
			}
		}
		return k;
    }
}




