class Q41NextGreater 
{
    public static void main(String[] args) 
	{
        int a[] = {5, 3, 10, 9, 6, 13};

        for(int i = 0; i < a.length; i++) {
            int next = -1;

            for(int j = i + 1; j < a.length; j++) {
                if(a[j] > a[i]) {
                    next = a[j];
                    break;
                }
            }

            System.out.println("Next greater of " + a[i] + " is: " + next
            System.out.println("Next greater of " + a[i] + " is: " + next);
        }
    }
}