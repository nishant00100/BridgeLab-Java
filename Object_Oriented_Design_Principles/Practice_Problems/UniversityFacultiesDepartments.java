import java.util.*;

class Faculty {
    String name;
    Faculty(String name) { this.name = name; }
}

class DepartmentU {
    String deptName;
    DepartmentU(String deptName) { this.deptName = deptName; }
}

class University {
    String name;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    University(String name) { this.name = name; }
    void addDepartment(DepartmentU d) { departments.add(d); }
    void addFaculty(Faculty f) { faculties.add(f); }
    void closeUniversity() {
        System.out.println("University " + name + " is closed");
        departments.clear();
    }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        University u = new University("Global University");
        u.addDepartment(new DepartmentU("CS"));
        u.addFaculty(new Faculty("Dr. Brown"));
        u.closeUniversity();
    }
}
