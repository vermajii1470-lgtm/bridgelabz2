package programmingelements;

import java.util.Scanner;

public class double_operator_precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double a = input.nextDouble();
		System.out.print("Enter the second number: ");
		double b = input.nextDouble();
		System.out.print("Enter the third number: ");
		double c = input.nextDouble();
		
		double w = a + b *c;
		double x = a * b + c;
		double y = c + a / b;
		double z = a % b + c;
		
		System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f.", w,
				x, y, z);
		
		input.close();

	}

}
