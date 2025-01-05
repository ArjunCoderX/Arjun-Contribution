import java.util.*; // importing package

public class BookFair {

    String Bname ; // variable to store book name
    double price ; // variable to store book price

    // default constructor
    public void BookFair() {
        Bname = " ";
        price = 0.0;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Book name.");
        Bname = sc.nextLine();

        System.out.println("Enter the Price.");
        price = sc.nextDouble();
    }

    public void Calculate() {
        double discount = 0.0;

        if(price <= 1000)
        discount = 2.0 ;

        else if(price > 1000 && price <= 3000)
        discount = 10.0 ;

        else if(price > 3000) 
        discount = 15.0 ;

        price = price - (price * (discount/100));
    }

    public void display() {
        System.out.println("Book name : "+Bname);
        System.out.println("Book Price after discount : "+price);
    }

    public static void main(String[] args) {
        BookFair obj = new BookFair();

        obj.BookFair();
        obj.Input();
        obj.Calculate();
        obj.display();
    }


}