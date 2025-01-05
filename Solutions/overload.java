import java.util.*; // importing package

public class overload { 

    // void print() function to print pattern
    public void print() {

        for(int i=1 ; i<=5 ; i++) {
            for(int j=1 ; j<=4 ; j++) {
                System.out.print(i+" "); // to print pattern
            }
            System.out.println();
        }
    }

    // void print(int n) to check lead number
    public void print(int n) {

        int temp ; // temperoray variable
        int digit ; // to store digits of number
        int oddsum = 0 ; // to store odd digits sum
        int evensum = 0 ; // to store even digit sum

        temp = n;

        // while loop for it 
        while(temp > 0) {
            digit = temp % 10 ;

            //conditons for even or odd
            if(digit % 2 == 0) 
            evensum = evensum + digit ;

            else
            oddsum = oddsum + digit ;

            temp = temp / 10 ;
        }

        // now conditions  to check lead number
        if(evensum == oddsum)
        System.out.println(n+" is a lead number.");

        else
        System.out.println(n+" is not a lead number.");
    }

    //main method to call them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scannner class
        overload obj = new overload() ; // object creation

        System.out.println("The Pattern is Given Below : ");
        obj.print();

        System.out.println("\n Enter the number.");
        int n = sc.nextInt();
        obj.print(n);
    }
}