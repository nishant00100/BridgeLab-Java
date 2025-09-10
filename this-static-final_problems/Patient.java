

public class Patient {
    private static String hospitalName;
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) { hospitalName = name; }
    public static int getTotalPatients() { return totalPatients; }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAilment() { return ailment; }
    public String getPatientID() { return patientID; }

    public static void main(String[] args) {
        Patient.setHospitalName("City Hospital");
        Patient p1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient p2 = new Patient("Lidiya", 45, "Fracture", "P002");

        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}
