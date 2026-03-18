import java.util.*;

class Q54TripletsArray
{
    public static void main(String x[])
    {
        int[] a = {-1, 0, 1, 2, -1, -4};
		
        Arrays.sort(a); // important step
        ArrayList<String> list = new ArrayList<>();
		
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = i+1 ; j < a.length ; j++)
            {
                for(int k = j+1 ; k < a.length ; k++)
                {
                    if(a[i] + a[j] + a[k] == 0)
                    {
                        String triplet = "[" + a[i] + "," + a[j] + "," + a[k] + "]";

                        if(!list.contains(triplet)) // avoid duplicates
                        {
                            list.add(triplet);
                        }
                    }
                }
            }
        }
        System.out.println(list);
    }
}