
public class ProductStaticFinal {
    private static double discount = 0.0; // percentage

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public ProductStaticFinal(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double percent) { if (percent >= 0 && percent <= 100) discount = percent; }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof ProductStaticFinal) {
            ProductStaticFinal p = (ProductStaticFinal) obj;
            return p.productID + ", " + p.productName + ", " + p.price + ", " + p.quantity + ", discount=" + discount;
        }
        return "Not a Product";
    }

    public double totalPrice() {
        double subtotal = price * quantity;
        return subtotal * (1 - discount / 100.0);
    }
}
