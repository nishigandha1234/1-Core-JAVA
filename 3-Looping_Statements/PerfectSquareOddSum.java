import java.util.Scanner;

public class PerfectSquareOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = 0;
        int odd = 1;

        while (sum < num) {
            sum += odd;
            odd += 2;
        }

        String result = (sum == num) ? "Perfect Square" : "Not a Perfect Square";
        System.out.println(result);
    }
}
