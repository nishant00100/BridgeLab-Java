// Abstract class representing a general Employee

abstract class Employee {

    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and setters with encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        }
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass for full-time employees
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // Fixed salary for full-time employees
    }
}

// Subclass for part-time employees
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate; // Salary based on hours worked
    }
}

// Interface for Department behavior
interface Department {

    void assignDepartment(String departmentName);

    String getDepartmentDetails();
}

// Implementation of Department interface
class EmployeeDepartment implements Department {

    private String departmentName;

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

// Demo class
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 500, 80);

        // Polymorphism: Employee reference to different types
        Employee[] employees = {e1, e2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }

        // Assign departments
        EmployeeDepartment dept = new EmployeeDepartment();
        dept.assignDepartment("HR");
        System.out.println(dept.getDepartmentDetails());
    }
}
