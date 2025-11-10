package programmingelements;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		float num1 = input.nextFloat();
		
		System.out.print("Enter Second number: ");
		float num2 = input.nextFloat();
		
		float addition = num1 + num2;
		float subtraction = num1 - num2;
		float multiplication = num1 * num2;
		float division = num1 / num2;
		
		System.out.printf("The addition, subtraction, multiplication and division"
				+ " value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f", num1, num2,
				addition, subtraction, multiplication, division);
		input.close();
	}

}
