import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String inputStr = sc.nextLine();
		String[] words = inputStr.split(" ");
		String outputStr = "";
		for(String word : words) {
			outputStr = outputStr + new StringBuilder(word).reverse() + " ";
		}
		System.out.println("Output String is: " + outputStr.trim());
	}

}
