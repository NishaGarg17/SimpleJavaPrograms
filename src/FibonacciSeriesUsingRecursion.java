import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

	public static void main(String[] args) {
		// take an input from the user
		System.out.println("Type Input Value for Fibonacci Series: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(0 + " ");
		fibonacci(n, 0, 1);

	}
	public static void fibonacci(int n, int var1, int var2) {
		System.out.print(var2 + " ");
		if(n > 2) 
			fibonacci(n-1, var2, var1 + var2);
		
	}

}
