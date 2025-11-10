
import java.util.*;

// Problem 2: University with Faculties and Departments (Composition and Aggregation)
public class UniversityCompositionAggregation {
    public static class University {
        private String name;
        // Composition: Departments live and die with University
        private List<Department> departments = new ArrayList<>();
        public University(String name) { this.name = name; }
        public Department createDepartment(String name) {
            Department d = new Department(name, this);
            departments.add(d);
            return d;
        }
        public List<Department> getDepartments() { return Collections.unmodifiableList(departments); }
        // Simulate delete: clear departments
        public void deleteUniversity() { departments.clear(); }
        public String getName() { return name; }
    }

    public static class Department {
        private String name;
        private University owner; // strong ownership
        Department(String name, University owner) { this.name = name; this.owner = owner; }
        public String getName() { return name; }
        public University getUniversity() { return owner; }
    }

    // Aggregation: Faculty exists independently
    public static class Faculty {
        private String name;
        public Faculty(String name) { this.name = name; }
        public String getName() { return name; }
    }
}
