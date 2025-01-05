import java.util.*; // importing package

public class stringAnalysis {
    public static void main(String[] args) {
        // creating scanner class for user input
        Scanner sc = new Scanner(System.in);
        
        String s ; // to store string
        int ndigit = 0 ; // to store number of digits
        int nalpha = 0 ; // to store number of alphabets
        int nspeci = 0 ; // to store number of special characters

        // prompt for user to input string
        System.out.println("Enter the String.");
        s = sc.nextLine();
       
        for(int i=0 ; i<s.length() ; i++) {
            char ch = s.charAt(i);

            // conditon to check digit or not
            if(Character.isDigit(ch))
            ndigit++ ;

            // conditon to check alphabet or not
            else if(Character.isLetter(ch))
            nalpha++ ;
            
            // conditon to check specialcharacter or not
            else
            nspeci++ ;
        }
 
        // printing output
        System.out.println("Number of digits = "+ndigit);
        System.out.println("Number of alphabet = "+nalpha);
        System.out.println("Number of special characters = "+nspeci);
    }
}