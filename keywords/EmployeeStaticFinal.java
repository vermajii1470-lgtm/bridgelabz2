
public class EmployeeStaticFinal {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public EmployeeStaticFinal(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() { System.out.println(totalEmployees); }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof EmployeeStaticFinal) {
            EmployeeStaticFinal e = (EmployeeStaticFinal) obj;
            return e.name + ", " + e.id + ", " + e.designation + ", " + companyName;
        }
        return "Not an Employee";
    }
}
