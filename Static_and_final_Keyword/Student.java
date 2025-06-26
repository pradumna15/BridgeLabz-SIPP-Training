class Student {
    // Static variable shared by all Student instances
    static String universityName = "National University";
    // Static variable to keep track of total students created
    static int totalStudents = 0;

    // Final variable: rollNumber cannot be changed once assigned
    private final int rollNumber;
    // Instance variables: unique to each student
    private String name;
    private String grade;

    // Constructor to initialize student details and increment total students
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Instance method to display student details
    void displayDetails() {
        // Check if the object is an instance of Student (always true here)
        if (this instanceof Student) {
            System.out.println("Name: " + this.name);
            System.out.println("Roll Number: " + this.rollNumber);
            System.out.println("Grade: " + this.grade);
            System.out.println("University: " + universityName);
        }
    }
}
