// Q11
import java.util.Scanner;

 public class q1{     public static void main(String[] args) {
    double number1, number2;

    Scanner sc = new Scanner(System.in);

         System.out.print("Enter the first number: ");
         number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number2 != 0 ? number1 / number2 : Double.NaN;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        sc.close();
    }
}

