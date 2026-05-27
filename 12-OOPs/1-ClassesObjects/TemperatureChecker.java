/*Question 5: Write a Java program to implement a Temperature Checker.
Create a class Temperature with attribute temp.
Check the weather condition: - temp > 35 => Hot - temp 20 to 35 => Normal - temp < 20 => Cold
Input: Enter Temperature : 18
Output: Temperature : 18 Weather : Cold*/

import java.util.Scanner;
class Temperature
{
    Scanner sc = new Scanner(System.in);

    private int temp;

    void setInfo()
    {
        System.out.print("Enter Temperature : ");
        temp = sc.nextInt();
    }
    void showResult()
    {
        System.out.println("Temperature : " + temp);

        if(temp > 35)
            System.out.println("Weather : Hot");
		else if(temp >= 20 && temp <= 35)
            System.out.println("Weather : Normal");
        else
            System.out.println("Weather : Cold");
    }
}

public class TemperatureChecker
{
    public static void main(String args[])
    {
		Temperature t1 = new Temperature();
        t1.setInfo();
        t1.showResult();
    }
}