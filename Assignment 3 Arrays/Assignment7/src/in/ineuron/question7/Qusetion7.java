package in.ineuron.question7;
import java.util.*;

public class Qusetion7 {
	public static void main(String[] args)
    {
        int nums[] = { 0,1,3,50,75};
        int low = 0, upp = 99;
        System.out.println(findMissingRanges(nums, low, upp));
    }
	 public static List<String> findMissingRanges(int[] nums, int low, int upp) {
	        int n = nums.length;
	        List<String> ans = new ArrayList<>();
	        if (n == 0) {
	            ans.add(f(low, upp));
	            return ans;
	        }
	        if (nums[0] > low) {
	            ans.add(f(low, nums[0] - 1));
	        }
	        for (int i = 1; i < n; ++i) {
	            int a = nums[i - 1], b = nums[i];
	            if (b - a > 1) {
	                ans.add(f(a + 1, b - 1));
	            }
	        }
	        if (nums[n - 1] < upp) {
	            ans.add(f(nums[n - 1] + 1, upp));
	        }
	        return ans;
	    }

	    private static String f(int a, int b) {
	        return a == b ? a + "" : a + "->" + b;
	    }

}
