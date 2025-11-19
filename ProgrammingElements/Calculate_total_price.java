// package programmingelements;

import java.util.Scanner;

public class Calculate_total_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the unit price: ");
		float unit_price = input.nextFloat();

		System.out.print("Enter the quantity: ");
		int quantity = input.nextInt();

		float total_price = unit_price * quantity;

		System.out.printf(" The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f",
				total_price, quantity, unit_price);

		input.close();

	}

}
