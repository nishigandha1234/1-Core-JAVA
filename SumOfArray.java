import java.util.*;

public class SumOfArray {
    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[9];

        // Input
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        // Brute force subarray sum
        for (int i = 0; i < a.length; i++) {
            int currSum = 0;

            for (int j = i; j < a.length; j++) {
                currSum = currSum + a[j];

                if (currSum > max) {
                    max = currSum;
                }
            }
        }

        System.out.println("Sum : " + max);
    }
}
