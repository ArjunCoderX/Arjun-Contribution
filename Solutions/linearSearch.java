import java.util.*; // importing package

public class linearSearch {
    public static void main(String[] args) {
        // creating scanner class for input
        Scanner sc = new Scanner(System.in);

        // double array declaration to store elements
        double[] a = new double[20] ;

        // to store which element to find
        double target ;

        //prompt for user to enter double array
        System.out.println("Enter the Double Array values.");

        // for loop for input
        for (int i=0 ; i<a.length ; i++) {
            a[i] = sc.nextDouble();
        }

        //prompt for user to enter value to search
        System.out.println("Enter the Value to Search.");
        target = sc.nextDouble();

        boolean found = false ; // to store status of element 
        int position = -1 ; // to store position of element

        for(int i=0 ; i<a.length ; i++) {
            //condition to find match with target
            if(a[i] == target) {
                found = true ;
                position = i+1 ;
                break ; // to break the loop when conditon satisfies
            }
        }

        // conditions to check element "Found" or "Not Found"
        if(found)
        System.out.println("Element 'Found' at "+position);
        else
        System.out.println("Element 'Not Found' .");

    }
}
