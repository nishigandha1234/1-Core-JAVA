import java.util.Scanner;

public class MonkeysLeftApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter total monkeys (n): ");
        int n = sc.nextInt();

        System.out.print("Enter total bananas (m): ");
        int m = sc.nextInt();

        System.out.print("Enter total peanuts (p): ");
        int p = sc.nextInt();

        System.out.print("Enter bananas per monkey (k): ");
        int k = sc.nextInt();

        System.out.print("Enter peanuts per monkey (j): ");
        int j = sc.nextInt();

        int monkeysThatAte = 0;

        // Keep looping until food finishes or all monkeys eat
        while ((m > 0 || p > 0) && monkeysThatAte < n) {
            // Monkey eats bananas
            if (m > 0) {
                int eat = Math.min(k, m);
                m -= eat;
                monkeysThatAte++;
            }

            // Monkey eats peanuts
            if (p > 0 && monkeysThatAte < n) {
                int eat = Math.min(j, p);
                p -= eat;
                monkeysThatAte++;
            }
        }

        int monkeysLeft = n - monkeysThatAte;

        System.out.println("Number of Monkeys left on the tree: " + monkeysLeft);

        sc.close();
    }
}
