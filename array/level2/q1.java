// 1.Create a program to find the bonus of 10 employees based on their years of service and 
// the total bonus amount the company Zara has to pay, along with the old and new salary.
// Hint => 
// Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Define a double array to save salary and years of service for each of the 10 employees
// Also define a double array to save the new salary and the bonus amount 
// as well as variables to save the total bonus, total old salary, and new salary
// Define a loop to take input from the user. 
// If salary or year of service is an invalid number then ask the use to enter again. 
// Note in this case you will have to decrement the index counter
// Define another loop to calculate the bonus of 10 employees based on their years of service. 
// Save the bonus in the array, compute the new salary, and save in the array. Also, 
// the total bonus and total old and new salary can be calculated in the loop
// Print the total bonus payout as well as the total old and new salary of all the employees
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] empData = new double[10][2]; 
        double[][] empBonusData = new double[10][2]; 
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            double salary = sc.nextDouble();
            double yearsOfService = sc.nextDouble();

            if (salary < 0 || yearsOfService < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            empData[i][0] = salary;
            empData[i][1] = yearsOfService;
        }

        
        for (int i = 0; i < 10; i++) {
            double salary = empData[i][0];
            double yearsOfService = empData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;
            empBonusData[i][0] = bonus;
            empBonusData[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}

