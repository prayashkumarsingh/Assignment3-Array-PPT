package in.ineuron.question;

public class Question1 {
	public static void closeTriplet(int[] arr, int n, int x, int count, int sum, int ind, int[] ans, int[] min) {
  
        if (ind == n) {
            if (count == 3) {
                if (Math.abs(x - sum) < min[0]) {
                    min[0] = Math.abs(x - sum);
                    ans[0] = sum;
                }
            }
            return;
        }
 
      
        closeTriplet(arr, n, x, count + 1, sum + arr[ind], ind + 1, ans, min);
 
      
        closeTriplet(arr, n, x, count, sum, ind + 1, ans, min);
    }

	public static void main(String[] args) {
		int[] arr = { -1, 2, 1, -4 };
        int target = 1;
        int n = arr.length;
        int[] min = { Integer.MAX_VALUE };
        int[] ans = new int[1];
        closeTriplet(arr, n, target, 0, 0, 0, ans, min);
        System.out.println(ans[0]);

	}

}
