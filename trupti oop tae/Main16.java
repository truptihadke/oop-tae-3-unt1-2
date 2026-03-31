/*16. A hospital manages different types of staff.
Question:
Create a base class Staff with method work().
Create subclasses:

 Doctor
 Nurse
 Receptionist
Override work() to display different responsibilities. */
// Base class Staff
class Staff {
    private String name;
    private String id;
    
    public Staff(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public void work() {
        System.out.println(name + " is working...");
    }
}

// Subclass Doctor
class Doctor extends Staff {
    private String specialty;
    
    public Doctor(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    
    @Override
    public void work() {
        System.out.println("Dr. " + getName() + " (ID: " + getId() + ") is examining patients.");
        System.out.println("Specialty: " + specialty);
        System.out.println("Responsibilities: Diagnosis, treatment, prescribing medicines");
    }
}

// Subclass Nurse
class Nurse extends Staff {
    private int yearsOfExperience;
    
    public Nurse(String name, String id, int yearsOfExperience) {
        super(name, id);
        this.yearsOfExperience = yearsOfExperience;
    }
    
    @Override
    public void work() {
        System.out.println("Nurse " + getName() + " (ID: " + getId() + ") is assisting patients.");
        System.out.println("Experience: " + yearsOfExperience + " years");
        System.out.println("Responsibilities: Patient care, medication administration, monitoring vitals");
    }
}

// Subclass Receptionist
class Receptionist extends Staff {
    private String department;
    
    public Receptionist(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }
    
    @Override
    public void work() {
        System.out.println("Receptionist " + getName() + " (ID: " + getId() + ") is managing reception.");
        System.out.println("Department: " + department);
        System.out.println("Responsibilities: Scheduling appointments, handling inquiries, patient registration");
    }
}

// Main class demonstrating polymorphism
public class Main16 {
    public static void main(String[] args) {
        System.out.println("===== HOSPITAL STAFF MANAGEMENT SYSTEM =====\n");
        
        // Create different staff members
        Staff doctor = new Doctor("Alexander Smith", "DOC001", "Cardiology");
        Staff nurse = new Nurse("Sarah Johnson", "NUR002", 5);
        Staff receptionist = new Receptionist("Emily Brown", "REC003", "Emergency");
        
        // Array of staff for dynamic polymorphic behavior
        Staff[] staffMembers = {doctor, nurse, receptionist};
        
        System.out.println("Staff Members and Their Responsibilities:\n");
        
        // Dynamically call work() method on each staff member
        for (Staff staff : staffMembers) {
            staff.work();
            System.out.println();
        }
        
        System.out.println("===== END OF DAY REPORT =====");
        System.out.println("Total staff members managed: " + staffMembers.length);
    }
}
