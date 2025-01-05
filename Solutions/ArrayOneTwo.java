import java.util.*; // importing package

public class ArrayOneTwo { 
    public static void main(String[] args) {
        // create a scanner class for input
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10] ; // array declaration
        int sumOneDigit = 0 ; // to store one digit sum
        int sumTwoDigit = 0 ; // to store two digit sum

        // prompt user to input array values
        System.out.println("Enter the 10 Values.");

        for(int i=0 ; i<10 ; i++) {
            a[i] = sc.nextInt();

            //conditons to check one digit sum
            if(a[i] > 0 && a[i] < 10)
            sumOneDigit += a[i];

            //conditons to check two digit sum 
            else if(a[i] > 10 && a[i] < 100)
            sumTwoDigit += a[i];
        }

        System.out.println("Sum of one-digit numbers: "+sumOneDigit);
        System.out.println("Sum of two-digit numbers: "+sumTwoDigit);
    }
    
}
