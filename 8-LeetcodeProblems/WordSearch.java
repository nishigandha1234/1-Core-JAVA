/*79. Word Search
Given an m x n grid of characters board and a string word, return true if word exists in the grid.The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.*/

class WordSearch
{
	public static void main(String x[])
	{
		char[][] board = {{"A","B","C","E"},
						   {"S","F","C","S"},
						   {"A","D","E","E"}};
		String word = "ABCCED";
		//System.out.println(exist(board, word));
		exist(board, word);
	}
	public static void exist(char[][] board, String word) 
	{
		String ans = "";
		for(int i = 0 ; i < board.length ; i++)
		{
			for(int j = 0 ; j < board[i].length ; j++)
			{
				if(board[i][j] == word.charAt(j))
				{
					ans += word.charAt(j);
				}
			}
		}
        System.out.println(ans);
    }
}