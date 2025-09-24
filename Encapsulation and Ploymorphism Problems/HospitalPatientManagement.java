// Abstract class representing a general patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters and setters with encapsulation
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        if(patientId > 0) this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) this.age = age;
    }

    // Abstract method to calculate the bill
    public abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Interface for managing medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private StringBuilder records;

    public InPatient(int id, String name, int age, double dailyRate, int daysAdmitted) {
        super(id, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.records = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":\n" + records);
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder records;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
        this.records = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName() + ":\n" + records);
    }
}

// Demo class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Alice", 30, 200, 5),
            new OutPatient(2, "Bob", 25, 100)
        };

        System.out.println("=== Patient Details and Billing ===");
        for(Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: $" + p.calculateBill());
            System.out.println("----------------------------");
        }

        // Manage medical records
        System.out.println("=== Adding Medical Records ===");
        ((MedicalRecord)patients[0]).addRecord("Admitted for surgery");
        ((MedicalRecord)patients[0]).addRecord("Post-surgery recovery");
        ((MedicalRecord)patients[1]).addRecord("Routine checkup");

        System.out.println("=== Viewing Medical Records ===");
        for(Patient p : patients) {
            ((MedicalRecord)p).viewRecords();
            System.out.println("----------------------------");
        }
    }
}
