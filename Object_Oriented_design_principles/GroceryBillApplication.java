
import java.util.*;

public class GroceryBillApplication {
    public static class Product { private String name; private double unitPrice; private double quantity; public Product(String name,double unitPrice,double quantity){ this.name=name; this.unitPrice=unitPrice; this.quantity=quantity; } public double cost(){ return unitPrice*quantity; } public String getName(){ return name; } }

    // Composition: Customer owns purchased Product items
    public static class Customer { private String name; private List<Product> items = new ArrayList<>(); public Customer(String name){ this.name=name; } public void addProduct(Product p){ items.add(p); } public List<Product> getItems(){ return items; } public String getName(){ return name; } }

    public static class BillGenerator { public double total(Customer c){ double t=0; for(Product p: c.getItems()) t+=p.cost(); return t; } public String printBill(Customer c){ StringBuilder sb=new StringBuilder(); sb.append("Bill for ").append(c.getName()).append(": "); for(Product p: c.getItems()) sb.append(p.getName()).append(" "); sb.append("Total=").append(total(c)); return sb.toString(); } }
}
