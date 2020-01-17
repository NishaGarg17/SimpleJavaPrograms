import java.util.Scanner;

public class ToggleEachWordInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String inputStr = sc.nextLine();
		String[] words = inputStr.split(" ");
		String outputStr = "";
		for(String word : words) {
			String firstChar = word.substring(0, 1);
			String afterFirst = word.substring(1, word.length());
			outputStr = outputStr + firstChar.toLowerCase() + afterFirst.toUpperCase() + " ";
		}
		System.out.println("Output String is: " + outputStr.trim());

	}

}
