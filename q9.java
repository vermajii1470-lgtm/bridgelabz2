// 9. Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
// Hint => 
// a. Create a variable named fee and take user input for fee.
// b. Create another variable discountPercent and take user input.
// c. Compute the discount and assign it to the discount variable.
// d. Compute and print the fee you have to pay by subtracting the discount from the fee.
// I/P => fee, discountPrecent
// O/P => The discount amount is INR ___ and final discounted fee is INR ___

// import java.awt.image.SampleModel;
 import java.util.Scanner;


public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Student Fee (INR): ");
        double Fee = sc.nextDouble();
        System.out.print("enter variable discountpercent:");
        double discountpercent = sc.nextDouble();
        double discount = (Fee*discountpercent)/100;
        double finalfee = Fee-discount;
        System.out.println("The discount amount is INR " + discount + " and final discount fee is INR " + finalfee);

        
    }
    
}
