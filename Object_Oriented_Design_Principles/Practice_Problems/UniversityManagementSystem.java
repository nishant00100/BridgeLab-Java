import java.util.*;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
    void assignProfessor(CourseUM c) {
        c.professor = this;
        System.out.println(name + " assigned to " + c.name);
    }
}

class StudentUM {
    String name;
    ArrayList<CourseUM> courses = new ArrayList<>();
    StudentUM(String name) { this.name = name; }
    void enrollCourse(CourseUM c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}

class CourseUM {
    String name;
    Professor professor;
    CourseUM(String name) { this.name = name; }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        StudentUM s = new StudentUM("Sophia");
        CourseUM c = new CourseUM("AI");
        Professor p = new Professor("Dr. Green");
        s.enrollCourse(c);
        p.assignProfessor(c);
    }
}
