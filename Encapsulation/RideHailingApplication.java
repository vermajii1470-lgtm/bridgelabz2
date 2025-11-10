abstract class VehicleRide {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    void getCurrentLocation();
}

class CarRide extends VehicleRide implements GPS {
    public CarRide(int id, String name, double rate) { super(id, name, rate); }
    public double calculateFare(double distance) { return distance * 15; }
    public void getCurrentLocation() { System.out.println("Car is at XYZ location."); }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        VehicleRide ride = new CarRide(1, "Alex", 15);
        System.out.println("Fare: " + ride.calculateFare(10));
        ((GPS)ride).getCurrentLocation();
    }
}
