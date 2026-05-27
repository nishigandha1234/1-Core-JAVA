/*Question 4: Write a Java program to implement a Voting Eligibility Checker.Create a class Person with attributes name and age.Check whether the person is eligible for voting.Condition: Age >= 18 => Eligible, Otherwise => Not Eligible.
Input:Enter Name : Rohan Enter Age : 16
Output: Name : Rohan Age : 16 Result : Not Eligible for Voting*/
import java.util.Scanner;

class Person
{
    Scanner sc = new Scanner(System.in);

    private String name;
    private int age;

    void setInfo()
    {
        System.out.print("Enter Name : ");
        name = sc.next();

        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }

    void showResult()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        if(age >= 18)
            System.out.println("Result : Eligible for Voting");
        else
            System.out.println("Result : Not Eligible for Voting");
    }
}

public class VotingEligibilityChecker
{
    public static void main(String args[])
    {
        Person e1 = new Person();
        e1.setInfo();
        e1.showResult();
    }
}