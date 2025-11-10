import java.io.IOException;
public class Q12_OnlineExamSystem {
    static class InvalidStudentException extends Exception { public InvalidStudentException(String m){ super(m);} }

    static void validateStudent(String id) throws InvalidStudentException {
        if(id == null || !id.startsWith("S-")) throw new InvalidStudentException("Student ID invalid.");
    }

    static void submitExam(String studentId) throws InvalidStudentException, IOException {
        validateStudent(studentId);
        // simulate possible IO problem
        if(studentId.equals("S-IOFAIL")) throw new IOException("Simulated IO failure.");
        System.out.println("Exam submitted for " + studentId);
    }

    public static void main(String[] args) {
        try {
            submitExam("INVALID");
        } catch (InvalidStudentException e) {
            System.out.println("Submission failed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Submission failed due to IO: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
