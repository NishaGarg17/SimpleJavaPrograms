import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int temp;
		System.out.println("Unsorted Array is: " + Arrays.toString(arr));
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array is: " + Arrays.toString(arr));

	}

}
