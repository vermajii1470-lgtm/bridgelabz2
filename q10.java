//10. Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("height in cm:");
        double height = sc.nextDouble();
        double inch = height/2.54;
        double totalInches = height / 2.54;
        double feet = totalInches/12;
        System.out.println("Your height in cm is " + height + " while in feet is " + feet + " and inches is " + inch);

        }
    
}
