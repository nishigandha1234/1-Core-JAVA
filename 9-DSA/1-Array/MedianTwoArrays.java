class MedianTwoArrays {
    public static void main(String[] args) {
        int a[] = {1,3};
        int b[] = {2};

        int c[] = new int[a.length + b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){
            if(a[i] < b[j])
				c[k++] = a[i++];
            else 
				c[k++] = b[j++];
        }

        while(i<a.length) 
			c[k++] = a[i++];
        while(j<b.length) 
			c[k++] = b[j++];

        int n = c.length;

        if(n%2==0)
            System.out.println((c[n/2]+c[n/2]-1)/2);
        else
            System.out.println(c[n/2]);
            System.out.println
    }
}