import java.util.*; // importing package

public class bubblesort {
    public static void main(String[] args) {
        // creating scanner class for input from user
        Scanner sc = new Scanner(System.in);

        // to store size of array
        int size ; 

        // prompt to user for array size input
        System.out.println("Enter the Size Of Array.");
        size = sc.nextInt();

        // conforming user about array size
        System.out.println("Your array size is "+size);

        // new array 
        int[] a = new int[size] ;

        // prompt for user to enter elements of array
        System.out.println("Enter the Elements Of Array.");

        for(int i=0; i<size ; i++) {
            a[i] = sc.nextInt();
        }

        // loop for bubble sort 
        for(int i=0 ; i < size - 1 ; i++) {
            for(int j=0 ; j < size - i - 1 ; j++) {
                if (a[j] > a[j + 1]) {
                    int temp ;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // printing sorted array 
        System.out.println("Sorted array :");
        for(int i=0 ; i<size ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}