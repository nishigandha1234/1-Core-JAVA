class Q48AlternateMerge {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};

        int i=0, j=b.length-1;

        while(i < a.length){
            System.out.print(a[i++] + " ");
            System.out.print(b[j--] + " ");
        }
    }
}