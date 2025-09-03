//Create a program to take a number as input and reverse the number. 
// To do this, store the digits of the number in an array and display the array in reverse order
// Hint => 
// Take user input for a number. 
// Find the count of digits in the number. 
// Find the digits in the number and save them in an array
// Create an array to store the elements of the digits array in reverse order
// Finally, display the elements of the array in reverse order  
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = sc.nextLong();
        
        // Count digits
        int count = 0;
        long tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        
        // Store digits in array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }
        
        // Display digits in reverse order
        System.out.println("Digits in reverse order:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i] + " ");
        }
        
        sc.close();
    }
}