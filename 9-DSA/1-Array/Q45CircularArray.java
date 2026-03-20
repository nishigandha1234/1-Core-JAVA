class Q45CircularArray {
    public static void main(String[] args) {
        int a[] = {10,8,-20,5,-3,-5,10,-13,11};

        int total=0, maxSum=a[0], curMax=0;
        int minSum=a[0], curMin=0;

        for(int i=0;i<a.length;i++){
            total += a[i];

            curMax = Math.max(a[i], curMax+a[i]);
            maxSum = Math.max(maxSum, curMax);

            curMin = Math.min(a[i], curMin+a[i]);
            minSum = Math.min(minSum, curMin);
        }

        int circular = total - minSum;
        System.out.println("Max Circular Sum: " + Math.max(maxSum, circular));
    }
}