/*3492. Maximum Containers on a Ship
You are given a positive integer n representing an n x n cargo deck on a ship. Each cell on the deck can hold one container with a weight of exactly w.However, the total weight of all containers, if loaded onto the deck, must not exceed the ship's maximum weight capacity, maxWeight.Return the maximum number of containers that can be loaded onto the ship.
Example 1: Input: n = 2, w = 3, maxWeight = 15 Output: 4 */

class MaximumContainersOnShip
{
	public static void main(String x[])
	{
		int n = 2, w = 3, maxWeight = 15 ;
		System.out.println(maxContainers(n,w,maxWeight));		
	}
	public static int maxContainers(int n, int w, int maxWeight) 
	{
		n = n*n;
		int allowedWeg = maxWeight/w;
		
		return Math.min(n, allowedWeg);
    }
}