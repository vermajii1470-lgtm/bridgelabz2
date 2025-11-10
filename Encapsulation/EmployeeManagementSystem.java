abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: " + baseSalary);
    }
}

interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String dept;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    public double calculateSalary() {
        return superSalary() + 5000;
    }

    public void assignDepartment(String dept) { this.dept = dept; }

    public void getDepartmentDetails() { System.out.println("Department: " + dept); }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private String dept;

    public PartTimeEmployee(int id, String name, double baseSalary, int hoursWorked) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hoursWorked * 500;
    }

    public void assignDepartment(String dept) { this.dept = dept; }

    public void getDepartmentDetails() { System.out.println("Department: " + dept); }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "John", 30000);
        Employee e2 = new PartTimeEmployee(102, "Doe", 0, 20);

        e1.displayDetails();
        e2.displayDetails();
        System.out.println("Salary: " + e1.calculateSalary());
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
