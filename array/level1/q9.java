//9. Working with Multi-Dimensional Arrays.
//  Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array
// Hint => 
// Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
// Copy the elements of the matrix to a 1D array. 
// For this create a 1D array of size rows*columns as in int[] array = new int[rows * columns];
// Define the index variable and Loop through the 2D array
// . Copy every element of the 2D array into the 1D array and increment the index
// Note: For looping through the 2D array, you will need Nested for loop, 
// Outer for loop for rows, and the inner for loops to access each element of the column
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}