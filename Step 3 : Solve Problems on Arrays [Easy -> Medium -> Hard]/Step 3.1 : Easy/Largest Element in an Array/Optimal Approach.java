import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        //Brute Force Approach
        // Arrays.sort(arr);
        // return arr[n -1];


        //Optimal Approach
        int max = arr[0];
        for(int i = 1 ; i < n; i++)
        {
            if(arr[i] > max)
            max = arr[i];
        }
        return max;

        // Time Complexity: O(N)
        // Space Complexity: O(1)
    }
}