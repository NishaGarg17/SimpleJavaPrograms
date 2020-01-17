
public class CountWordsInString {

	public static void main(String[] args) {
		String str = InputOutput.input();
		String[] words = str.trim().split(" ");
		System.out.println("Number of words in a given String- '" + str + "' are: " + words.length);
		
	}

}
