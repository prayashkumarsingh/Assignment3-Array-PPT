package in.ineuron.question4;

public class Question4 {
	static int index(int[] arr, int n, int K)
	{
	    int start = 0;
	    int end = n - 1;
	    while (start <= end)
	    {
	        int mid = (start + end) / 2;
	        if (arr[mid] == K)
	            return mid;
	 
	        else if (arr[mid] < K)
	            start = mid + 1;
	 
	        else
	            end = mid - 1;
	    }
	    return end + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
	    int n = arr.length;
	    int K = 2;
	     
	    System.out.println(index(arr, n, K));
	}

}
