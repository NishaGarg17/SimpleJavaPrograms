import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String str = sc.nextLine();
		System.out.println("Original String is: " + str);
		System.out.println("Reverse String is: " + new StringBuilder(str).reverse());
	}

}
