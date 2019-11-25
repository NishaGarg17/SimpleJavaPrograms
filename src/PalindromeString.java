import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String str;
		boolean isPalindromicString = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String: ");
		str = sc.nextLine();
		
		// First way using direct code
		for(int i = 0; i < str.length()/2; i ++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				System.out.println("inside IF...");
				isPalindromicString = false;
				break;
			}
		}
		if(isPalindromicString == true) {
			System.out.println(str + " is a palindromic String.");
		} else {
			System.out.println(str + " is a not palindromic String.");
		}
		
		// 2nd way using predefined methods of JAVA..
		/*
		 * if(str.equals(new StringBuffer(str).reverse())) { System.out.println(str +
		 * " is a palindromic String."); } else { System.out.println(str +
		 * " is a not palindromic String."); }
		 */
	}

}
