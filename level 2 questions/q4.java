// Q14
import java.util.Scanner;

public class q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3;

        // 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance " + distanceInFeet + " feet is " + distanceInYards + " yards and " + distanceInMiles + " miles");

        sc.close();
    }
}

