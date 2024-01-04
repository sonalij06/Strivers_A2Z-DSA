

import java.util.* ;
import java.io.*; 
public class Solution {
    static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int small = a[0];
        int large = a[0];
        int small_second = Integer.MAX_VALUE;
        int large_second = Integer.MIN_VALUE;
        for (int i = 0 ;i < n ;i++)
        {
            if(a[i] < small)
            small = a[i];
            if(a[i] > large)
            large = a[i];
        }
        for(int i = 0 ;i < n ; i++)
        {
            if(a[i] < small_second && a[i] > small && small < small_second)
            {
                small_second = a[i];
            }
            if(a[i] > large_second && a[i] < large)
            {
                large_second = a[i];
            }

        }
        int[] b =new int[2];
        b[0] = large_second;
        b[1] = small_second;
        return b;
    }
}