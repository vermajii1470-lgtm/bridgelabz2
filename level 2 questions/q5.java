
// Q15
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter unit price of the item (INR): ");
        double unitPrice = Sc.nextDouble();

        System.out.print("Enter quantity to be bought: ");
        int quantity = Sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity
                + " and unit price is INR " + unitPrice);

        Sc.close();
    }
}
