import java.util.Scanner;

public class Lappy {
    String name;
    double price;
    double dis;
    double amt;

    // Method to accept customer details
    public void accept_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name of Customer.");
        name = sc.nextLine();

        System.out.println("Enter the Price of Laptop.");
        price = sc.nextDouble();
    }

    // Method to compute the discount based on price
    public void compute_discount() {
        // Conditions for discount
        if(price <= 25000) 
            dis = 5.0;
        else if(price >= 25001 && price <= 50000) 
            dis = 7.5;
        else if(price >= 50001 && price <= 100000)
            dis = 10.0;
        else 
            dis = 15.0;

        amt = price - ((price * dis) / 100);
    }

    // Method to display the details
    public void display_details() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + dis + "%");
        System.out.println("Amount to be paid: " + amt);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Lappy obj = new Lappy();

        obj.accept_details(); // Accept customer details
        obj.compute_discount(); // Compute discount based on price
        obj.display_details(); // Display the result
    }
}
