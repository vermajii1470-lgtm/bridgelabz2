abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
}

class InPatient extends Patient implements MedicalRecord {
    public InPatient(int id, String n, int a) { super(id, n, a); }
    public double calculateBill() { return 10000; }
    public void addRecord(String record) { System.out.println("Record Added: " + record); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "John", 45);
        System.out.println("Bill: " + p.calculateBill());
        ((MedicalRecord)p).addRecord("Routine Checkup");
    }
}
