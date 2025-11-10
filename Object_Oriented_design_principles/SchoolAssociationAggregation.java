
import java.util.*;

// Problem 1: School and Students with Courses (Association and Aggregation)
public class SchoolAssociationAggregation {
    // Aggregation: School has Students (students can exist independently)
    static class School {
        private String name;
        private List<Student> students = new ArrayList<>();
        public School(String name) { this.name = name; }
        public void addStudent(Student s) { students.add(s); }
        public List<Student> getStudents() { return Collections.unmodifiableList(students); }
        public String getName() { return name; }
    }

    // Association: Student <-> Course (many-to-many)
    static class Student {
        private final String id;
        private String name;
        private Set<Course> courses = new LinkedHashSet<>();
        public Student(String id, String name) { this.id = id; this.name = name; }
        public void enroll(Course c) { this.courses.add(c); c.addStudent(this); }
        public String viewCourses() {
            StringBuilder sb = new StringBuilder();
            for (Course c : courses) sb.append(c.getCode()).append(" ");
            return sb.toString().trim();
        }
        public String toString() { return name + "(" + id + ")"; }
    }

    static class Course {
        private final String code;
        private String title;
        private Set<Student> students = new LinkedHashSet<>();
        public Course(String code, String title) { this.code = code; this.title = title; }
        void addStudent(Student s) { students.add(s); }
        public String getCode() { return code; }
        public String listStudents() {
            StringBuilder sb = new StringBuilder();
            for (Student s : students) sb.append(s.toString()).append(" ");
            return sb.toString().trim();
        }
    }
}
