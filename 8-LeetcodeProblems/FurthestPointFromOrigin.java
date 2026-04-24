//2833. Furthest Point From Origin
//Input: moves = "L_RL__R" Output: 3 Explanation: The furthest point we can reach //from the origin 0 is point -3 through the following sequence of moves "LLRLLLR".

class FurthestPointFromOrigin
{
	public static void main(String x[])
	{
		String moves = "L_RL__R";
		System.out.println(furthestDistanceFromOrigin(moves));
	}
	public static int furthestDistanceFromOrigin(String moves) 
	{
        int lCount = 0 , rCount = 0, _Count = 0;
		
		for(int i = 0 ; i < moves.length() ; i++)
		{
			char ch = moves.charAt(i);
			
			if(ch == 'L')
			{
				lCount++;
			}
			else if(ch == 'R')
			{
				rCount++;
			}
			else{
				_Count++;
			}
		}
		int distance = Math.abs((lCount - rCount)+ (_Count)) ;
		return distance
    }
}