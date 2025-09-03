import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Check ---");

        
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered for Student " + (i + 1));
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
