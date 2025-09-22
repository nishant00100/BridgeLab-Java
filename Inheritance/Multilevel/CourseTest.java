
class Course {

    String courseName;
    int duration;

    Course(String name, int dur) {
        courseName = name;
        duration = dur;
    }
}

class OnlineCourse extends Course {

    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int dur, String plat, boolean rec) {
        super(name, dur);
        platform = plat;
        isRecorded = rec;
    }
}

class PaidOnlineCourse extends OnlineCourse {

    double fee, discount;

    PaidOnlineCourse(String name, int dur, String plat, boolean rec, double fee, double disc) {
        super(name, dur, plat, rec);
        this.fee = fee;
        this.discount = disc;
    }
}

public class CourseTest {

    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Mastery", 30, "Udemy", true, 200, 50);
        System.out.println("Course: " + poc.courseName + " | Platform: " + poc.platform + " | Fee after discount: " + (poc.fee - poc.discount));
    }
}
