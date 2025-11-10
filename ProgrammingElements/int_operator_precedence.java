package programmingelements;

import java.util.Scanner;

public class int_operator_precedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = input.nextInt();
		System.out.print("Enter the second number: ");
		int b = input.nextInt();
		System.out.print("Enter the third number: ");
		int c = input.nextInt();
		
		int w = a + b *c;
		int x = a * b + c;
		int y = c + a / b;
		int z = a % b + c;
		
		System.out.printf("The results of Int Operations are %d, %d, %d, and %d.", w,
				x, y, z);
		
		input.close();

	}

}
