
public class HourGlass {

	public static void main(String[] args) {
		int[][] input = {{0, 3, 0, 0, 0},
		        {0, 1, 0, 0, 0},
		        {1, 1, 1, 0, 0},
		        {0, 0, 2, 4, 4},
		        {0, 0, 0, 2, 4}};
		final int R = 5;
		final int C = 5;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		if(input.length < 3) {
			System.out.println("Not Possible");
		} else {
			System.out.println("Total Number of Hour Glasses in an Array are: " + (R-2) * (C-2));
		}
		
		for(int i = 0; i < R-2; i++ ) {
			for(int j = 0; j < C-2; j++) {
				sum = input[i][j] + input[i][j + 1] + input[i][j + 2] + input[i + 1][j + 1] + input[i + 2][j] + input[i +2][j + 1] + input[i + 2][j + 2];
				if(max < sum) {
					max = sum;
				}
			}
		}
		System.out.println("Maximum sum of hour glass is: " + max);
	}

}
