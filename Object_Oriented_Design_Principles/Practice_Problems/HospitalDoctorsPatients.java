class Doctor {
    String name;
    Doctor(String name) { this.name = name; }
    void consult(Patient p) {
        System.out.println("Doctor " + name + " consults patient " + p.name);
    }
}

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Hospital {
    String name;
    Hospital(String name) { this.name = name; }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Smith");
        Patient p = new Patient("Alice");
        d.consult(p);
    }
}
