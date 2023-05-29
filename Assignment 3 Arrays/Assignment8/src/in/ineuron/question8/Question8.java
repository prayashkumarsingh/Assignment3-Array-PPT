package in.ineuron.question8;

public class Question8 {
	public static boolean canAttend(int[][] intervals){
		if(intervals == null || intervals.length == 0) return true;
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i][0] < intervals[i - 1][1])
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] t = {{0, 3}, {5, 10}, {15, 20}};
		System.out.println(canAttend(t));
	}

}
