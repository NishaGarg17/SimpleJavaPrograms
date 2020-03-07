import java.util.Arrays;

public class JugglingAlgo {
	
	public static void main(String[] args) {
		String str = "Nisha";
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
		int n = 12;
		int d = 3;
		
		int gcd = findGcd(n,d);
		System.out.println("Original Array is: " + Arrays.toString(arr));
		arr = rotateArray(arr, n, d, gcd);
		System.out.println("Array after " + d + " rotations is: " + Arrays.toString(arr));
	}

	private static int[] rotateArray(int[] arr, int n, int d, int gcd) {
		for(int i = 0; i < d; i++) {
			int temp = arr[i];
			int j = 0;
			int k = i;
			while(j < d) {
				arr[k] = arr[k + d];
				k = k + d;
				j++;
			}
			arr[k] = temp;
		}
		return arr;
	}

	private static int findGcd(int n, int d) {
		if(d == 0) {
			return n;
		} else {
			return findGcd(d, n % d);
		}
	}

}
