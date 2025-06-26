class Product {
    // Static variable shared by all Product instances
    static double discount = 10.0;

    // Final variable: productID cannot be changed once assigned
    private final String productID;
    // Instance variables: unique to each product
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Instance method to display product details
    void displayDetails() {
        // Check if the object is an instance of Product (always true here)
        if (this instanceof Product) {
            System.out.println("Product Name: " + this.productName);
            System.out.println("Product ID: " + this.productID);
            System.out.println("Price: " + this.price);
            System.out.println("Quantity: " + this.quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}
