
import java.util.*;

// Problem 4: E-commerce Platform with Orders, Customers, and Products
public class EcommerceOrdersAggregation {
    public static class Product { private String id; private String name; private double price; public Product(String id, String name, double price){ this.id=id; this.name=name; this.price=price; } public double getPrice(){ return price; } public String getName(){ return name; } }
    public static class Customer { private String name; public Customer(String name){ this.name=name; } public String getName(){ return name; } public Order placeOrder(Product... products){ Order o=new Order(this); for(Product p: products) o.addProduct(p); return o; } }
    // Aggregation: Order aggregates products (products exist independently)
    public static class Order { private Customer customer; private List<Product> items = new ArrayList<>(); public Order(Customer customer){ this.customer=customer; } public void addProduct(Product p){ items.add(p); } public double total(){ double t=0; for(Product p: items) t+=p.getPrice(); return t; } public String summary(){ StringBuilder sb=new StringBuilder(); sb.append("Order by ").append(customer.getName()).append(": "); for(Product p: items) sb.append(p.getName()).append(" "); sb.append("Total=").append(total()); return sb.toString(); } }
}
