package programmingelements;

import java.util.Scanner;

public class height_in_cms_to_feet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the height in cms: ");
		double height_cms = input.nextDouble();
		
		double inch = height_cms/2.54;
		
		double feet = inch/12;
		
		System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f", height_cms, feet, inch);
		
		input.close();
		
	}

}
