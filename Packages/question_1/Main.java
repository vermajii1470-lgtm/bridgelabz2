import college.student.Student;
import college.faculty.Faculty;


public class Main {
   public static void main(String[] var0) {
        Student student = new Student();
        Faculty faculty = new Faculty();
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Roll No: " + student.roll_no);      
        System.out.println("Faculty Name: " + faculty.name);
        System.out.println("Faculty Subject: " + faculty.subject);
   }
}

