import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        //Brute Force Approach
        Arrays.sort(arr);
        return arr[n -1];

        // Time Complexity: O(N*log(N))
        // Space Complexity: O(n)



    }
}