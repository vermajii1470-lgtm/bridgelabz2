
import java.util.*;

// Problem 5: University Management System
public class UniversityManagementRelations {
    public static class Course { private String code; private String title; private Professor professor; private Set<Student> students=new LinkedHashSet<>(); public Course(String code,String title){ this.code=code; this.title=title; }
        public void assignProfessor(Professor p){ this.professor=p; }
        public void enroll(Student s){ students.add(s); s.enrollCourse(this); }
        public String roster(){ StringBuilder sb=new StringBuilder(); for(Student s: students) sb.append(s.getName()).append(" "); return sb.toString().trim(); }
        public String getCode(){ return code; }
    }

    public static class Student { private String name; private Set<Course> courses=new LinkedHashSet<>(); public Student(String name){ this.name=name; } public String getName(){ return name; } public void enrollCourse(Course c){ this.courses.add(c); } public String listCourses(){ StringBuilder sb=new StringBuilder(); for(Course c: courses) sb.append(c.getCode()).append(" "); return sb.toString().trim(); } }

    public static class Professor { private String name; public Professor(String name){ this.name=name; } public String getName(){ return name; } }
}
