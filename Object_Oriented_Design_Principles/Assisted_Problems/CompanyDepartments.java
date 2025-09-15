import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();
    Department(String deptName) { this.deptName = deptName; }
    void addEmployee(Employee e) { employees.add(e); }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();
    Company(String name) { this.name = name; }
    void addDepartment(Department d) { departments.add(d); }
    void closeCompany() {
        System.out.println("Closing company " + name);
        departments.clear();
    }
}

public class CompanyDepartments {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Department d = new Department("IT");
        d.addEmployee(new Employee("John"));
        c.addDepartment(d);
        c.closeCompany();
    }
}
