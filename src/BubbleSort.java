import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		System.out.println("Unsorted Array is: " + Arrays.toString(arr));
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			//	System.out.println("Array after each pass: " + Arrays.toString(arr));
		}
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

}
