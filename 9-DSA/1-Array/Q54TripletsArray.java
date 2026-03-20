import java.util.*;

import java.util.*;

class Q54TripletsArray
{
    public static void main(String[] args) {
        int a[] = {-1,0,1,2,-1,-4};
        Arrays.sort(a);

        for(int i=0;i<a.length-2;i++){
            int l=i+1, r=a.length-1;

            while(l<r){
                int sum = a[i]+a[l]+a[r];

                if(sum==0){
                    System.out.println(a[i]+" "+a[l]+" "+a[r]);
                    l++; r--;
                }
                else if(sum<0) l++;
                else r--;
            }
        }
    }
}