import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers whos GCD you want to find out: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		int least = num1 < num2 ? num1 : num2;
		int gcd = 1;
	
		for(int i = 2; i <= least; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		
		System.out.println("GCD of given numbers is: " + gcd);
	}

}
