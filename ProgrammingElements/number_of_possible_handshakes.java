package programmingelements;

import java.util.Scanner;

public class number_of_possible_handshakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int n = input.nextInt();
		
		int possible_handshakes = (n * (n-1))/2 ;
		
		System.out.printf("The number of possible handshakes is %d among %d students.", possible_handshakes, n);
		
		input.close();

	}

}
