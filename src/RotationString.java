import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First String: ");
		String str1 = sc.nextLine();
		System.out.println("Second String: ");
		String str2 = sc.nextLine();

		// way to check rotation if one string is rotation of other without using
		// concatenation
		/*
		 * if(str1.length() != str2.length()) { System.out.println("'" + str2 +
		 * "' is not a rotation of '" + str1 + "'"); } else if(str1.equals(str2)) {
		 * System.out.println("'" + str2 + "' is a rotation of '" + str1 + "'"); } else
		 * if(!str2.contains(str1.subSequence(0, 1))) { System.out.println("'" + str2 +
		 * "' is not a rotation of '" + str1 + "'"); } else { int index =
		 * str2.indexOf(str1.charAt(0)); int finalPos = str2.length() - index;
		 * System.out.println(str1.substring(finalPos));
		 * System.out.println(str2.substring(0, index));
		 * if(str1.substring(finalPos).equals(str2.substring(0, index))) {
		 * System.out.println("'" + str2 + "' is a rotation of '" + str1 + "'"); } else
		 * { System.out.println("'" + str2 + "' is not a rotation of '" + str1 + "'"); }
		 * }
		 */

		// way to check rotation if one string is rotation of other using concatenation
		if (str1.length() != str2.length()) {
			System.out.println("'" + str2 + "' is not a rotation of '" + str1 + "'");
		} else if (str1.equals(str2)) {
			System.out.println("'" + str2 + "' is  a rotation of '" + str1 + "'");
		} else {
			String str3 = str1 + str1;
			if(str3.contains(str2)) {
				System.out.println("'" + str2 + "' is  a rotation of '" + str1 + "'");
			}
		}

	}

}
