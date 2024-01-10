public class Solution {
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        for(int i = 0 ; i < n - 1; i++)
        {
            if(a[i] == 0)
{
            for(int j = i + 1; j < n ; j++)
            {
                if(a[j] != 0)
                {
                    a[i] = a[j];
                    a[j] = 0;
                    break;
                }
            }
        }
    }
    return a;
}
}