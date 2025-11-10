package programmingelements;

import java.util.Scanner;

public class input_student_fee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the student fee: ");
		int fee = input.nextInt();
		
		System.out.println("Enter the University discount amount: ");
		int discounted_percent = input.nextInt();
		
		int discount = (fee/100)*discounted_percent;
		int discounted_fee = fee-discount;
		System.out.printf("The discount amount is INR %d and final discounted fee is INR %d", discount , discounted_fee);
		
		input.close();
	}

}
