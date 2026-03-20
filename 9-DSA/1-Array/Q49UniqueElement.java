class Q49UniqueElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,1,5,20,2,12,10};

        for(int i=0;i<a.length;i++){
            int count = 0;

            for(int j=0;j<a.length;j++){
                if(a[i] == a[j]) count++;
            }

            if(count == 1){
                System.out.print(a[i]+" ");
            }
        }
    }
}