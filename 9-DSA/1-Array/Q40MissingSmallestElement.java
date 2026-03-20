import java.util.Scanner;

class Q40MissingSmallestElement
{
    public static void main(String[] args) {
        int[] a = {0,1,2,4,5};

        for(int i = 0; i < a.length; i++) {
            if(a[i] != i) {
                System.out.println("Smallest Missing: " + i);
                return;
            }
        }

        // if no missing inside array
        System.out.println("Smallest Missing: " + a.length);
    }
}