class BankAccount {
    // Static variable shared by all instances
    static String bankName = "ABC Bank";
    // Static variable to keep track of total accounts created
    static int totalAccounts = 0;

    // Final variable: account number cannot be changed once assigned
    private final String accountNumber;
    // Instance variable: unique to each account
    private String accountHolderName;

    // Constructor to initialize account details and increment total accounts
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // Static method to display total number of accounts
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Instance method to display account details
    void displayDetails() {
        // Check if the object is an instance of BankAccount (always true here)
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Bank Name: " + bankName);
        }
    }
}
