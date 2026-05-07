/*1861. Rotating the Box
You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell of the box is one of the following: A stone '#' A stationary obstacle '*' Empty '.'
The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions*/

class RotatingTheBox
{
	public static void main(String x[])
	{
		char [][] boxGrid = {{"#",".","#"}};
	}
	public static char[][] rotateTheBox(char[][] boxGrid) 
	{
        int rows = boxGrid.length;
        int cols = boxGrid[0].length;

        // Step 1: Move stones (#) to right side
        for (int i = 0; i < rows; i++) {

            int last = cols - 1;   // last empty position

            for (int j = cols - 1; j >= 0; j--) {

                if (boxGrid[i][j] == '*') {
                    // obstacle found, stones cannot cross it
                    last = j - 1;
                }

                else if (boxGrid[i][j] == '#') {

                    // remove stone from current place
                    boxGrid[i][j] = '.';

                    // place stone at rightmost empty place
                    boxGrid[i][last] = '#';

                    last--;
                }
            }
        }

        // Step 2: Rotate matrix 90 degree clockwise
        char[][] ans = new char[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                ans[j][rows - 1 - i] = boxGrid[i][j];
            }
        }

        return ans;	   
    }
}