class Q44ClosestZero {
    public static void main(String[] args) {
        int a[] = {38,44,63,-51,-35,19,84,-69,4,-46};

        int minSum = Integer.MAX_VALUE;
        int x=0, y=0;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int sum = a[i]+a[j];

                if(Math.abs(sum) < Math.abs(minSum)){
                    minSum = sum;
                    x = a[i];
                    y = a[j];
                }
            }
        }

        System.out.println("Pair: ["+x+","+y+"]");
    }
}