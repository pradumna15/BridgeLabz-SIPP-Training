// Employee class demonstrating static, final, and instance variables
class Employee {
    // Static variable shared by all Employee instances
    static String companyName = "XYZ Corp";
    // Static variable to keep track of total employees created
    static int totalEmployees = 0;

    // Final variable: id cannot be changed once assigned
    private final int id;
    // Instance variables: unique to each employee
    private String name;
    private String designation;

    // Constructor to initialize employee details and increment total employees
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total number of employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Instance method to display employee details
    void displayDetails() {
        // Check if the object is an instance of Employee (always true here)
        if (this instanceof Employee) {
            System.out.println("Name: " + this.name);
            System.out.println("ID: " + this.id);
            System.out.println("Designation: " + this.designation);
            System.out.println("Company: " + companyName);
        }
    }
}
