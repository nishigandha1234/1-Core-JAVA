//657. Robot Return to Origin
//Input: moves = "UD" Output: true Explanation: The robot moves up once, and //then down once. All moves have the same magnitude, so it ended up at the //origin where it started. Therefore, we return true.

class RobotReturnToOrigin
{
	public static void main(String x[])
	{
		String moves = "UD";
		System.out.println(judgeCircle(moves));
	}
	public static boolean judgeCircle(String moves) 
	{
		int up = 0 , down = 0 ,left = 0 ,right = 0 ; 
        for(int i = 0 ; i < moves.length() ; i++)
		{
			char ch = moves.charAt(i);
			
			if(ch == 'U')
			{
				up++;
			}
			else if(ch == 'D')
			{
				down++;
			}
			else if(ch == 'L')
			{
				left++;
			}
			else if(ch == 'R')
			{
				right++;
			}
			else{
				return false;
			}
		}
		return up == down && left =
		return up == down && left == right;
    }
}