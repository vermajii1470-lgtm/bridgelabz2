import java.time.LocalDateTime;
public class Q9_OnlineExamSubmission {
    static class LateSubmissionException extends Exception { public LateSubmissionException(String m){ super(m);} }
    static class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String m){ super(m);} }

    static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 11, 1, 23, 59);

    static void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        if(!fileName.toLowerCase().endsWith(".pdf")) throw new InvalidFileFormatException("Only .pdf files allowed.");
        if(submissionTime.isAfter(DEADLINE)) throw new LateSubmissionException("Submission is late. Deadline was " + DEADLINE);
        System.out.println("Submission successful for " + fileName + " at " + submissionTime);
    }

    public static void main(String[] args) {
        try {
            submitExam("answer.docx", LocalDateTime.now());
        } catch (InvalidFileFormatException e) {
            System.out.println("Submission failed: invalid file format");
        } catch (LateSubmissionException e) {
            System.out.println("Submission failed: late submission");
        }
    }
}
