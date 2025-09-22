package Hierarical;
// File: SchoolSystem.java

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String sub) {
        super(name, age);
        subject = sub;
    }

    void displayRole() {
        System.out.println("Teacher: " + name + " | Subject: " + subject);
    }
}

class Student extends Person {

    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student: " + name + " | Grade: " + grade);
    }
}

class Staff extends Person {

    String duty;

    Staff(String name, int age, String duty) {
        super(name, age);
        this.duty = duty;
    }

    void displayRole() {
        System.out.println("Staff: " + name + " | Duty: " + duty);
    }
}

public class SchoolTest {

    public static void main(String[] args) {
        Teacher t = new Teacher("Alice", 35, "Math");
        Student s = new Student("Bob", 15, 10);
        Staff st = new Staff("Charlie", 40, "Administration");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
