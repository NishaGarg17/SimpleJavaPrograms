import java.util.Scanner;

public class InputOutput {

	public static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String: ");
		return sc.nextLine();		
	}
	public static void output(String str) {
		System.out.println("Output String is: " + str);
	}

}
