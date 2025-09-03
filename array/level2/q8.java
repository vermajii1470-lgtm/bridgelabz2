// 8. Create a program to take input marks of students in 3 subjects physics, chemistry, and maths.
//  Compute the percentage and then calculate the grade  as per the following guidelines 

// Hint => 
// Take input for the number of students
// Create arrays to store marks, percentages, and grades of the students
// Take input for marks of students in physics, chemistry, and maths. If the marks are negative,
//  ask the user to enter positive values and decrement the index
// Calculate the percentage and grade of the students based on the percentage
// Display the marks, percentages, and grades of each student

import java.util.*;
public class q8 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = Sc.nextInt();

        int[][] marks = new int[number][3]; 
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                while (true) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print("Enter marks (out of 100) for " + subject + " for student " + (i + 1) + ": ");
                    int mark = Sc.nextInt();
                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        break;
                    }
                    System.out.println("Please enter a valid positive value between 0 and 100 for marks.");
                }
            }

            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        System.out.printf("%-10s %-10s %-10s %-15s %-10s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-10d %-10d %-15.2f %-10s%n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}