
class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, double salary, String lang) {
        super(name, id, salary);
        this.programmingLanguage = lang;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {

    int durationMonths;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.durationMonths = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
    }
}

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] emps = {
            new Manager("Alice", 1, 90000, 5),
            new Developer("Bob", 2, 70000, "Java"),
            new Intern("Charlie", 3, 20000, 6)
        };
        for (Employee e : emps) {
            e.displayDetails();
            System.out.println("---");
        }
    }
}
