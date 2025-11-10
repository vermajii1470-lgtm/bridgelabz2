
public class PatientStaticFinal {
    private static String hospitalName = "General Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public PatientStaticFinal(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() { return totalPatients; }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof PatientStaticFinal) {
            PatientStaticFinal p = (PatientStaticFinal) obj;
            return p.name + ", " + p.age + ", " + p.ailment + ", " + p.patientID + ", " + hospitalName;
        }
        return "Not a Patient";
    }
}
