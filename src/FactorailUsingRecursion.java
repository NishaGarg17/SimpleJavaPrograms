import java.util.Scanner;

public class FactorailUsingRecursion {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		System.out.println("Factorial for a Given Number: " + n + " is: " + factorial(n));

	}
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

}
