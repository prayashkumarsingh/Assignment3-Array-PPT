package in.ineuron.question6;

public class Question6 {
	public static void main(String[] args) {
		int num[] = { 2, 3, 5, 4, 5, 3, 4 };
		int n = num.length;
		System.out.println("The Element occurring once is " + singleOne(num, n) + " ");
	}

	static int singleOne(int ar[], int ar_size) {
		int nums = ar[0];
		for (int i = 1; i < ar_size; i++)
			nums = nums ^ ar[i];

		return nums;
	}

}
