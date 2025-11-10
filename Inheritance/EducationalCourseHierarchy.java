class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void showDetails() {
        System.out.println("Course: " + courseName + " | Platform: " + platform + " | Fee after discount: " + (fee - discount));
    }

    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse("Java Mastery", 60, "Udemy", true, 4999, 999);
        p.showDetails();
    }
}
