import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		System.out.println("Unsorted Array is: " + Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int l, int r) {
		System.out.println("inside merge sort");
		if(l < r) {
			int m = (l + r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m , r);
		}
		
	}

	private static void merge(int[] arr, int l, int m, int r) {
		System.out.println("inside merge");
		System.out.println("l: " + l + " m: " + m + " r: " + r);
		int n1, n2;
		int i = 0, j = 0;
		int k = l;
		
		// n1 and n2 to determine length of left and right sub arrays
		  n1 = m - l + 1; 
	      n2 = r - m; 
		
		System.out.println("n1: " + n1 + " n2: " + n2);
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		

		// let's create two temp arrays left and right
		for(int index = 0; index < n1; index++) {
		leftArr[index] = arr[l + index];
		}
		for(int index = 0; index < n2; index++) {
		 rightArr[index] = arr[m + 1+ index];
		}
		System.out.println("Arr: " + Arrays.toString(arr) + " LeftArr: " + Arrays.toString(leftArr) + " RightArr: " + Arrays.toString(rightArr));
		while(i < n1 && j < n2) {
			System.out.println("k is: " + k);
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			System.out.println(i);
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
		System.out.println("Now Arr is: " + Arrays.toString(arr));
	}
	
}
