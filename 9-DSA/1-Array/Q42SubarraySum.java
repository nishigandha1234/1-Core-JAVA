class Q42SubarraySum {
    public static void main(String[] args) {

        int a[] = {3, 4, -7, 1, 3, 3, 1, -4};
        int target = 7;

        System.out.println("The given array is : ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSubarrays with given sum:");

        for(int i = 0; i < a.length; i++) {
            int sum = 0;

            for(int j = i; j < a.length; j++) {
                sum += a[j];

                if(sum == target) {
                    System.out.print("[" + i + "to" + j + "] -- { ");
                    
                    for(int k = i; k <= j; k++) {
                        System.out.print(a[k] + " ");
                    }

                    System.out.println("}");
                }
            }
        }
    }
}