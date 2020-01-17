import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		n = sc.nextInt();
		int tempNum = n;
		int result = 0;
		int r;
		while(tempNum > 0) {
			r = tempNum % 10;
			result = result + (r * r * r);
			tempNum = tempNum / 10;
		}
		if(n == result) {
			System.out.println("Given Number: " + n + " is a Armstrong Number");
		} else {
			System.out.println("Given Number: " + n + " is not a Armstrong Number");
		}
	}
	
}
