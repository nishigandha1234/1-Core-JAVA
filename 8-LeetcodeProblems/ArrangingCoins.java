//441. Arranging Coins
//You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.Given the integer n, return the number of complete rows of the staircase you will build.

import java.util.Scanner;

public class ArrangingCoins
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int row = 1;

        while(n >= row)
        {
            n = n - row;
            row++;
        }

        System.out.println("Complete rows: " + (row - 1));
    }
}