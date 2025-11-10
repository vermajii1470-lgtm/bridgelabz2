
import java.util.*;

// Problem 3: Hospital, Doctors, and Patients (Association and Communication)
public class HospitalAssociationCommunication {
    public static class Hospital { private String name; public Hospital(String name) { this.name = name; } }

    public static class Doctor {
        private String name; private Set<Patient> patients = new LinkedHashSet<>();
        public Doctor(String name) { this.name = name; }
        public String consult(Patient p) { this.patients.add(p); p.addDoctor(this); return "Consultation: " + name + " with " + p.getName(); }
        public String listPatients() { StringBuilder sb = new StringBuilder(); for (Patient p: patients) sb.append(p.getName()).append(" "); return sb.toString().trim(); }
    }

    public static class Patient {
        private String name; private Set<Doctor> doctors = new LinkedHashSet<>();
        public Patient(String name) { this.name = name; }
        void addDoctor(Doctor d) { doctors.add(d); }
        public String getName() { return name; }
        public String listDoctors() { StringBuilder sb = new StringBuilder(); for (Doctor d: doctors) sb.append(d.name).append(" "); return sb.toString().trim(); }
    }
}
