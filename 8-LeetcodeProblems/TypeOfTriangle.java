//3024

import java.util.Arrays;

class TypeOfTriangle 
{
    public String triangleType(int[] nums) {
        Arrays.sort(nums);   // Sort to make triangle check easy
        
        // Check triangle validity
        if (nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        
        // Check types
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } 
        else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } 
        else {
            return "scalene";
        }
    }
}