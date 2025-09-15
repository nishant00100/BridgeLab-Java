import java.util.*;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    Course(String name) { this.name = name; }
    void addStudent(Student s) { students.add(s); }
    void showStudents() {
        System.out.println("Course " + name + " students:");
        for (Student s : students) System.out.println(" - " + s.name);
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();
    Student(String name) { this.name = name; }
    void enroll(Course c) {
        courses.add(c);
        c.addStudent(this);
    }
    void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) System.out.println(" - " + c.name);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();
    School(String name) { this.name = name; }
    void addStudent(Student s) { students.add(s); }
}

public class SchoolStudentsCourses {
    public static void main(String[] args) {
        School sch = new School("High School");
        Student s1 = new Student("Mike");
        Student s2 = new Student("Emma");
        Course math = new Course("Math");
        Course sci = new Course("Science");
        s1.enroll(math); s1.enroll(sci);
        s2.enroll(math);
        s1.showCourses(); s2.showCourses(); math.showStudents();
    }
}
