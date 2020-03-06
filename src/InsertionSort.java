import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int key;
		int j;
		System.out.println("Unsorted Array is: " + Arrays.toString(arr));
		
		for(int i = 1; i < arr.length; i++) {
			j = i - 1;
			key = arr[i];
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

}
