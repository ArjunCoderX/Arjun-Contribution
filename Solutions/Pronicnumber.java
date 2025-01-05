import java.util.*; // importing package

public class Pronicnumber {

    public static void main(String[] args) {
        // creating scannner class for input
        Scanner sc = new Scanner(System.in);

        int num ; // variable to store number
        
        // prompt for user to enter number
        System.out.println("Enter the Number.");
        num = sc.nextInt();

        // condition to check whether it is a pronic num or not
        if(isPronic(num)){
            System.out.println(num+" is a pronic number.");
        }

        else
        System.out.println(num+" is not a pronic number.");
    }

    // method to check for pronic num
    public static boolean isPronic(int num) {
        for(int i=0 ; i * (i+1) <= num ; i++) {
            if(i * (i+1) == num)
            return true;
        }

        return false;
    }
}