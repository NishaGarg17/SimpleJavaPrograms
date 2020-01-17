import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First String: ");
		String str1 = sc.nextLine();
		System.out.println("Second String: ");
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		} else {
			char[] array1 = str1.toLowerCase().toCharArray();
			char[] array2 = str2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if(Arrays.equals(array1, array2)) {
				System.out.println(str1 + " and " + str2 + " are anagrams.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagrams.");
			}
		}

	}

}
