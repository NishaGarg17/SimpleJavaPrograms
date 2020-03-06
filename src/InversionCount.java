
public class InversionCount {

	public static void main(String[] args) {
		int[] arr = {1,9,6,4,5};
		int inversionCount = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					inversionCount++;
				}
			}
		}
		System.out.println("Total Inversion Count is: " + inversionCount);
	}

}
