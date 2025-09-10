class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    // Public method to access private variable
    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        }
    }
}

class PostgraduateStudent extends Student {
    public void showName() {
        System.out.println("PG Student Name: " + name); // Accessing protected member
    }
}
