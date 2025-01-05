import java.util.*;

public class railwayTicket {
    String name ;  // to store name of the customer
    String Coach ; // to store coach customer want to travel 
    long mobno ;   // to store customer mobile number
    int amt ;      // to store basic amount of ticket
    int totalamt ; // to store the amount paid after updating the orignal amount

    // Member method for accepting details
    public void accept_details() {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the Name of the customer.");
        name = sc.nextLine();

        System.out.println("Enter the Coach Type (Frist_AC, Second_AC, Third_AC, Sleeper)'");
        Coach = sc.nextLine();

        System.out.println("Enter the customer mobile number.");
        mobno = sc.nextLong();

        System.out.println("Enter the Base Amount of Ticket.");
        amt = sc.nextInt();
    }

    // Member method for Updating details
    public void update_details() {
        int extraAmount = 0 ;

        switch(Coach) {
            case "Frist_AC" :
            extraAmount = 700 ;
            break;

            case "Second_AC" :
            extraAmount = 500 ;
            break;

            case "Third_AC" :
            extraAmount = 250 ;
            break;

            case "Sleeper" : 
            extraAmount = 0 ;

            default :
            System.out.println("Invaild Coach.");
            return;

        }

        totalamt = amt + extraAmount ;
    }

    // Member method for displaying details
    public void display_details() {

        System.out.println("Name : "+name);
        System.out.println("Mobile Number : "+mobno);
        System.out.println("Coach : "+Coach);
        System.out.println("Base Amount : "+amt);
        System.out.println("Total Amount : "+totalamt);
    }

    //Main method
    public static void main(String[] args) {
        railwayTicket obj = new railwayTicket();

        // calling methods   
        obj.accept_details();
        obj.update_details();
        obj.display_details();
    }
}