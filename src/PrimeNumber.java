import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// to get input from the user
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if (n == 0 || n == 1) {
			System.out.println("Given number: " + n + " is not prime number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					System.out.println("Given number: " + n + " is not a Prime Number");
					break;
				}
			}
			if (isPrime) {
				System.out.println("Given number: " + n + " is a Prime Number");
			}

		}
		
	}

}
