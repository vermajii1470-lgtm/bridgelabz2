package programmingelements;

import java.util.Scanner;

public class dist_from_feet_to_miles_yards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the distance in feets: ");
		float dist_feet = input.nextFloat();
		
		float dist_miles = dist_feet/5280;
		float dist_yards = dist_feet/3;
		
		System.out.printf("The distance %.2f feet is equal to %.2f yards and %.2f miles.", dist_feet, dist_yards, dist_miles);
		
		input.close();
	}

}
