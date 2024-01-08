import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int result = 1;
		int a,b;
		for(int i = 0 ; i < arr.size() - 1; i++)
		{
			a = arr.get(i);
			b = arr.get(i + 1);
			if(a != b)
			result++;
		}
		return result;
	}
}