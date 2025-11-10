
public class VehicleStaticFinal {
    private static double registrationFee = 500.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public VehicleStaticFinal(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) { if (fee >= 0) registrationFee = fee; }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof VehicleStaticFinal) {
            VehicleStaticFinal v = (VehicleStaticFinal) obj;
            return v.ownerName + ", " + v.vehicleType + ", " + v.registrationNumber + ", fee=" + registrationFee;
        }
        return "Not a Vehicle";
    }
}
