
public class StudentStaticFinal {
    private static String universityName = "National University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    public StudentStaticFinal(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() { System.out.println(totalStudents); }

    public String detailsIfInstance(Object obj) {
        if (obj instanceof StudentStaticFinal) {
            StudentStaticFinal s = (StudentStaticFinal) obj;
            return s.name + ", " + s.rollNumber + ", " + s.grade + ", " + universityName;
        }
        return "Not a Student";
    }

    public void updateGrade(String grade) { this.grade = grade; }
}
