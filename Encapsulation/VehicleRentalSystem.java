abstract class Vehicle {
    private String vehicleNumber;
    private double rentalRate;

    public Vehicle(String vehicleNumber, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, rate); }
    public double calculateRentalCost(int days) { return days * 1000; }
    public double calculateInsurance() { return 2000; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v = new Car("MH12AB1234", 1000);
        System.out.println("Rental Cost: " + v.calculateRentalCost(5));
        System.out.println("Insurance: " + ((Insurable)v).calculateInsurance());
    }
}
