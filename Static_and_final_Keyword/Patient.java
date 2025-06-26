class Patient {
    // Static variable shared by all Patient instances
    static String hospitalName = "City Hospital";
    // Static variable to keep track of total patients created
    static int totalPatients = 0;

    // Final variable: patientID cannot be changed once assigned
    private final String patientID;
    // Instance variables: unique to each patient
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize patient details and increment total patients
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to display total number of patients
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Instance method to display patient details
    void displayDetails() {
        // Check if the object is an instance of Patient (always true here)
        if (this instanceof Patient) {
            System.out.println("Patient Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Ailment: " + this.ailment);
            System.out.println("Patient ID: " + this.patientID);
            System.out.println("Hospital: " + hospitalName);
        }
    }
}
