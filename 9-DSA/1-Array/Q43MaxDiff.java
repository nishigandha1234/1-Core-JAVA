class Q43MaxDiff {
    public static void main(String[] args) {
        int a[] = {7,9,5,6,13,2};

        int min = a[0];
        int maxDiff = 0;
        int x = min, y = a[0];

        for(int i = 1; i < a.length; i++) {
            if(a[i] - min > maxDiff) {
                maxDiff = a[i] - min;
                x = min;
                y = a[i];
            }

            if(a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Elements: " + x + ", " + y);
        System.out.println("Max Difference: " + maxDiff);
    }
}