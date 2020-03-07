import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int var1 = 0;
		int var2 = 1;
		int var3;
		// take an input from the user
		System.out.println("Type Input Value for Fibonacci Series: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// print out the fixed values
		System.out.print(var1 + " " + var2 + " ");
		for(int i = 2; i < n; i++) {
			var3 = var1 + var2; 
			var1 = var2;
			var2 = var3;
			System.out.print(var3 + " ");
		}

	}

}
