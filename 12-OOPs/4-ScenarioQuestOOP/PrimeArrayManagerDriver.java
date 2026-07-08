import java.util.*;

class PrimeArrayManager {
    int[] arr;
    int[] prime;
    int[] noPrime;
    int primeCount = 0;
    int noPrimeCount = 0;

    public PrimeArrayManager(int[] arr) {
        this.arr = arr;
        prime = new int[arr.length];
        noPrime = new in
        noPrime = new int[arr.length];
    }

    boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Sort Prime Numbers in Ascending Order
    void sortPrime() {
        for (int i = 0; i < primeCount - 1; i++) {
            for (int j = i + 1; j < primeCount; j++) {
                if (prime[i] > prime[j]) {
                    int temp = prime[i];
                    prime[i] = prime[j];
                    prime[j] = temp;
                }
            }
        }
    }

    // Sort Non-Prime Numbers in Descending Order
    void sortNotPrime() {
        for (int i = 0; i < noPrimeCount - 1; i++) {
            for (int j = i + 1; j < noPrimeCount; j++) {
                if (noPrime[i] < noPrime[j]) {
                    int temp = noPrime[i];
                    noPrime[i] = noPrime[j];
                    noPrime[j] = temp;
                }
            }
        }
    }

    // Separate Prime and Non-Prime Numbers
    void separate() {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                prime[primeCount++] = arr[i];
            else
                noPrime[noPrimeCount++] = arr[i];
        }
    }

    // Merge Arrays
    int[] merge() {
        int[] ans = new int[arr.length];
        int index = 0;

        for (int i = 0; i < primeCount; i++) {
            ans[index++] = prime[i];
        }

        for (int i = 0; i < noPrimeCount; i++) {
            ans[index++] = noPrime[i];
        }

        return ans;
    }

    // Display Result
    void display(int[] ans) {
        System.out.print("\nPrime Numbers : ");
        for (int i = 0; i < primeCount; i++) {
            System.out.print(prime[i] + " ");
        }

        System.out.print("\nNon Prime Numbers : ");
        for (int i = 0; i < noPrimeCount; i++) {
            System.out.print(noPrime[i] + " ");
        }

        System.out.print("\nFinal Array : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

public class PrimeArrayManagerDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        PrimeArrayManager pm = new PrimeArrayManager(arr);

        pm.separate();
        pm.sortPrime();
        pm.sortNotPrime();

        int[] result = pm.merge();

        pm.display(result);
    }
}