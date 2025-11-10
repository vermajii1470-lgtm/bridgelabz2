// // Base class
// class Patient {
//     String name;
//     int age;
//     String disease;

//     public Patient(String name, int age, String disease) {
//         this.name = name;
//         this.age = age;
//         this.disease = disease;
//     }

//     public void showDetails() {
//         System.out.println("\n--- Patient Details ---");
//         System.out.println("Name    : " + name);
//         System.out.println("Age     : " + age);
//         System.out.println("Disease : " + disease);
//     }
// }

// OutPatient class
class OutPatient extends Patient {
    double consultationFee;

    public OutPatient(String name, int age, String disease, double consultationFee) {
        super(name, age, disease);
        this.consultationFee = consultationFee;
    }

    public void showBill() {
        showDetails();
        System.out.println("Consultation Fee : Rs. " + consultationFee);
    }
}

// InPatient class
class InPatient extends Patient {
    int daysAdmitted;
    double dailyCharge;

    public InPatient(String name, int age, String disease, int daysAdmitted, double dailyCharge) {
        super(name, age, disease);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void showBill() {
        showDetails();
        System.out.println("Days Admitted : " + daysAdmitted);
        System.out.println("Daily Charge  : Rs. " + dailyCharge);
        System.out.println("Total Bill    : Rs. " + calculateBill());
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hospital Management System");
        System.out.println("1. OutPatient (Checkup)");
        System.out.println("2. InPatient (Admitted)");
        System.out.print("Choose type of patient: ");
        int choice = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();
            OutPatient op = new OutPatient(name, age, disease, fee);
            op.showBill();

        } else if (choice == 2) {
            System.out.print("Enter No. of Days Admitted: ");
            int days = sc.nextInt();

            System.out.print("Enter Daily Charge (Rs.): ");
            double charge = sc.nextDouble();

            InPatient ip = new InPatient(name, age, disease, days, charge);
            ip.showBill();

        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}


base class for in patient;

 class in patient extend patient{no usages

string dignosis; 1 usage 
public in patient (int patientID,string name , int age , string dignosis){
    superr
}

}

class Patient {
    String name;
    int age;
    String disease;

    public Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

}
