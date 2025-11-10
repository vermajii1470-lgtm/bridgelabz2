package programmingelements;

import java.util.Scanner;

public class perimeter_of_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the perimeter of square");
		float perimeter = input.nextFloat();
		
		float side = perimeter/4;
		
		System.out.printf("The length of side of square is %.2f whose perimeter is %.2f", side, perimeter);
		
		input.close();
	}

}
