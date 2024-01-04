

import java.util.* ;
import java.io.*; 
public class Solution {
    static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        //[this approach only works if there are no duplicates]
    Arrays.sort(a);
        int[] b =new int[2];
        b[0] = a[n - 2];
        b[1] = a[1];
        return b;
    }
}