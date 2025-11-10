import java.time.LocalDate;
public class Q6_VehicleMaintenanceTracker {
    static class ServiceOverdueException extends Exception { public ServiceOverdueException(String m){ super(m);} }
    static class InvalidMileageException extends Exception { public InvalidMileageException(String m){ super(m);} }

    static void checkMaintenance(LocalDate serviceDate, int mileage) throws ServiceOverdueException, InvalidMileageException {
        if(mileage < 0) throw new InvalidMileageException("Mileage cannot be negative.");
        if(serviceDate.isBefore(LocalDate.now())) throw new ServiceOverdueException("Service date is overdue since " + serviceDate);
        System.out.println("Vehicle is up-to-date. Next service on: " + serviceDate + ", mileage: " + mileage);
    }

    public static void main(String[] args) {
        try {
            checkMaintenance(LocalDate.of(2024, 1, 1), 15000);
        } catch (InvalidMileageException e) {
            System.out.println("Maintenance check failed: " + e.getMessage());
        } catch (ServiceOverdueException e) {
            System.out.println("Maintenance check failed: " + e.getMessage());
        }
    }
}
