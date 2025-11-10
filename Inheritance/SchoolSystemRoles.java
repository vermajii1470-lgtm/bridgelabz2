class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher: " + name + " teaches " + subject);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student: " + name + " in grade " + grade);
    }
}

class Staff extends Person {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public void displayRole() {
        System.out.println("Staff: " + name + " works as " + position);
    }

    public static void main(String[] args) {
        new Teacher("Alice", 30, "Math").displayRole();
        new Student("Bob", 16, "10th").displayRole();
        new Staff("Charlie", 40, "Clerk").displayRole();
    }
}
