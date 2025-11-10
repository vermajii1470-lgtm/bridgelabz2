package programmingelements;

import java.util.Scanner;

public class convert_km_to_miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter distance in kilometers: ");
		double km = input.nextDouble();
		
		double miles = km / 1.6;
		
		System.out.printf("The total miles is %.2f mile for the given %.2f km%n", miles, km);
		
		input.close();
		
	}

}
