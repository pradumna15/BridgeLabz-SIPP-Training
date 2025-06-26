class Vehicle {
    // Static variable shared by all Vehicle instances
    static double registrationFee = 5000.0;

    // Final variable: registrationNumber cannot be changed once assigned
    private final String registrationNumber;
    // Instance variables: unique to each vehicle
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Instance method to display vehicle details
    void displayDetails() {
        // Check if the object is an instance of Vehicle (always true here)
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}
