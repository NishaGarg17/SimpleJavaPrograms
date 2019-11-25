import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n;
		
		// take an input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		n = sc.nextInt();
		int tempNum = n;
		int reverseNum = 0;
		
		
		while(tempNum > 0) {
			reverseNum = reverseNum * 10 + tempNum % 10;
			tempNum = tempNum / 10;
		}
		System.out.println(reverseNum);
		if(n == reverseNum) {
			System.out.println("Palindrome");
		}
		
		// Using methods of String and String Buffer
		/*
		 * if(Integer.toString(n).equals(new
		 * StringBuffer(Integer.toString(n)).reverse().toString())) {
		 * System.out.println("Palindrome"); }
		 */
	}
		
		

}
