
public class ReverseToggleEachWordInString {

	public static void main(String[] args) {
		String inputStr = InputOutput.input();
		String[] words = inputStr.split(" ");
		String outputStr = "";
		for(String word : words) {
			String reverse = new StringBuilder(word).reverse().toString();
			String firstChar = reverse.substring(0, 1);
			String afterFirst = reverse.substring(1, word.length());
			outputStr = outputStr + firstChar.toLowerCase() + afterFirst.toUpperCase() + " ";
		}
		
		System.out.println(outputStr.trim());
	}

}
