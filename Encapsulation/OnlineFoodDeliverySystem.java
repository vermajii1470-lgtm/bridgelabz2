abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return 100 * 2; }
    public double applyDiscount() { return 10; }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem f = new VegItem("Paneer", 100, 2);
        System.out.println("Total Price: " + f.calculateTotalPrice());
    }
}
