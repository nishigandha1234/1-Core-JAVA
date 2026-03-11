//2806. Account Balance After Rounded Purchase
//Initially, you have a bank account balance of 100 dollars.You are given an integer purchaseAmount representing the amount you will spend on a purchase in dollars, in other words, its price.When making the purchase, first the purchaseAmount is rounded to the nearest multiple of 10. Let us call this value roundedAmount. Then, roundedAmount dollars are removed from your bank account.Return an integer denoting your final bank account balance after this purchase.

class AccountBalanceAfterRounderPurchase
{
	public static void main(String x[])
	{
		System.out.println(accountBalanceAfterPurchase(15));
	}
	public static int accountBalanceAfterPurchase(int purchaseAmount)
	{
		int roundedAmount = (((purchaseAmount + 5) / 10) * 10);
		int balance = 100 - roundedAmount;
		return balance;
    }
}