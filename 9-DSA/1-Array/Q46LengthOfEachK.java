class Q46LengthOfEachK {
    public static void main(String[] args) {
        int a[] = {1,3,6,21,4,9,12,3,16,10};
        int k = 4;

        for(int i=0;i<=a.length-k;i++){
            int max = a[i];

            for(int j=i;j<i+k;j++){
                if(a[j] > max){
                    max = a[j];
                }
            }

            System.out.println(max);
        }
    }
}