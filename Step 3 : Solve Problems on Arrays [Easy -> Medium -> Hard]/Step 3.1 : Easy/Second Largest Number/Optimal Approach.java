public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int small = Integer.MAX_VALUE;
        int small_second = 0;
        int large = Integer.MIN_VALUE;
        int large_second = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] < small)
            {
                small_second = small;
                small = a[i];
               
            }
             else if (a[i] < small_second && a[i] != small)
	   {
		  small_second = a[i];
	   }
            if(a[i] > large)
         {
             large_second = large;
            large = a[i];

        }
        else if (a[i] > large_second && a[i] != large)
		{
			large_second = a[i];
		}
        }
        int[] b = new int[2];
        b[0] = large_second;
        b[1] = small_second;
        return b;
    }
}