// Q16
import java.util.Scanner;

public class q6{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        sc.close();
    }
}
    
