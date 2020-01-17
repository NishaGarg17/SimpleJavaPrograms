import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int d = 2;
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		for(int i = 1; i <=2; i++) {
			int start = arr[0];
			for(int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = start;
		}
		
		System.out.println("Array after rotation of " + d + " times is: " + Arrays.toString(arr));

	}

}
