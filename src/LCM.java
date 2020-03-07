import java.util.Scanner;

public class LCM {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers whose LCM you want find out: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm = num1 > num2 ? num1 : num2;
		while(!(lcm % num1 == 0 && lcm % num2 == 0)) {
			lcm++;
		}
		
		System.out.println("LCM of the given numbers is: " + lcm);
	}
}
