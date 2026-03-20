import java.util.*;

class Q55FourSum {
    public static void main(String[] args) {
        int a[] = {1,0,-1,0,-2,2};
        int target = 0;

        Arrays.sort(a);

        for(int i=0;i<a.length-3;i++){
            for(int j=i+1;j<a.length-2;j++){

                int l=j+1, r=a.length-1;

                while(l<r){
                    int sum = a[i]+a[j]+a[l]+a[r];

                    if(sum==target){
                        System.out.println(a[i]+" "+a[j]+" "+a[l]+" "+a[r]);
                        l++; r--;
                    }
                    else if(sum<target) l++;
                    else r--;
                }
            }
        }
    }
}