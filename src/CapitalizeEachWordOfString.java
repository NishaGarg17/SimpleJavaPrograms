import java.util.Scanner;

public class CapitalizeEachWordOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String: ");
		String str = sc.nextLine();
		String outputStr = "";
		String[] words = str.split("\\s");
	
		for(String word : words) {
			String firstChar = word.substring(0, 1);
			String afterFirst = word.substring(1,word.length());
			outputStr = outputStr + firstChar.toUpperCase() + afterFirst + " ";
		}
		System.out.println("Output String is: " + outputStr.trim());
	}

}
