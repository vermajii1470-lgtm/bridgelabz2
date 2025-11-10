package programmingelements;

import java.util.Scanner;

public class quotient_and_reminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		float num1 = input.nextFloat();
		System.out.print("Enter the second number: ");
		float num2 = input.nextFloat();
		
		float quotient = num1 / num2;
		float reminder = num1 % num2;
		
		System.out.printf("The Quotient is %.2f and Reminder is %.2f of two number %.2f and %.2f.", quotient,
				reminder, num1, num2);
		
		input.close();

	}

}
