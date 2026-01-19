import java.util.*;

class CompoundInterest {
    public static void main(String[] x) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal : "); 
        int p = sc.nextInt();

        System.out.println("Enter the Rate : "); 
        int r = sc.nextInt();

        System.out.println("Enter the Time : "); 
        int t = sc.nextInt();

        double amount = p * Math.pow(1 + (r / 100.0), t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
    }
}
