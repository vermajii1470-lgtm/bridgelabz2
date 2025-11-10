
import java.util.*;

public class SchoolResultsApplication {
    public static class Subject {
        private String name; private int marks;
        public Subject(String name, int marks){ this.name=name; this.marks=marks; }
        public int getMarks(){ return marks; }
        public String getName(){ return name; }
    }

    // Aggregation: Student has many Subject entries
    public static class Student { private String name; private List<Subject> subjects=new ArrayList<>();
        public Student(String name){ this.name=name; }
        public void addSubject(Subject s){ subjects.add(s); }
        public List<Subject> getSubjects(){ return subjects; }
        public String getName(){ return name; }
    }

    public static class GradeCalculator {
        public String calculate(Student s){ if(s.getSubjects().isEmpty()) return "No subjects"; double total=0; for(Subject sub: s.getSubjects()) total+=sub.getMarks(); double avg= total / s.getSubjects().size(); if(avg>=90) return "A"; if(avg>=75) return "B"; if(avg>=60) return "C"; if(avg>=50) return "D"; return "F"; }
    }
}
