// 7.
import java.util.Scanner;
public class q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.println("Enter three double values (a, b, c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Perform operations
        double result1 = a + b * c;   // Multiplication first, then addition
        double result2 = a * b + c;   // Multiplication first, then addition
        double result3 = c + a / b;   // Division before addition
        double result4 = a % b + c;   // Modulus before addition (works for double too)

        // Output
        System.out.println("The results of Double Operations are: " 
                + result1 + ", " + result2 + ", " + result3 + ", " + result4);

        sc.close();
    } 
}
