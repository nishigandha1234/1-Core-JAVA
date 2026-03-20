import java.util.Arrays;

class Q51Top3 {
    public static void main(String[] args) {
        int a[] = {78,90,90,86,85,92,70,92};

        Arrays.sort(a);

        int count = 0;
        for(int i=a.length-1;i>=0 && count<3;i--){
            if(i==a.length-1 || a[i] != a[i+1]){
                System.out.print(a[i]+" ");
                count++;
            }
        }
    }
}