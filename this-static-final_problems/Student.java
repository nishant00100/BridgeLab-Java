

public class Student {
    private static String universityName;
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String name) { universityName = name; }
    public static void displayTotalStudents() { System.out.println("Total Students Enrolled: " + totalStudents); }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        }
    }

    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public char getGrade() { return grade; }

    public static void main(String[] args) {
        Student.setUniversityName("Global University");
        Student s1 = new Student("Hemashree", 101, 'A');
        Student s2 = new Student("Sharmila", 102, 'B');

        Student.displayTotalStudents();
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s2.updateGrade('A');
        s2.displayStudentDetails();
    }
}
