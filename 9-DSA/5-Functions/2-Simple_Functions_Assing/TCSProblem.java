class TCSProblem
{
    public static void main(String x[])
    {
        int[] a = {55,12,33,12,33,12,33,45,11,45,11,45,11,45,111,89};

        int maxElement = 0, maxCount = 0;

        for(int i = 0; i < a.length; i++)
        {
            boolean visited = false;

            // check if already counted
            for(int k = 0; k < i; k++)
            {
                if(a[i] == a[k])
                {
                    visited = true;
                    break;
                }
            }

            if(visited) continue;

            int count = 1;

            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    count++;
                }
            }

            // First unique element
            if(count == 1)
            {
                System.out.println("First Unique: " + a[i]);
            }

            // Most frequent
            if(count > maxCount)
            {
                maxCount = count;
                maxElement = a[i];
            }
        }

        System.out.println("Most Frequent: " + maxElement);
        System.out
    }
}