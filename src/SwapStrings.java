import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First String: ");
		String str1 = sc.nextLine();
		System.out.println("Second String: ");
		String str2 = sc.nextLine();
		
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After swap: " + str1 + " " + str2);

	}

}
