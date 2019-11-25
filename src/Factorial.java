import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n;
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		if(n == 0) {
			System.out.println("Factorial for a Given Number: " + n + " is: " + factorial);
		} else {
			for(int i = 2; i <= n; i++ ) {
				factorial = factorial * i;
			}
			System.out.println("Factorial for a Given Number: " + n + " is: " + factorial);
		}

	}

}
