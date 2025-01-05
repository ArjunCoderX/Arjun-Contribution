import java.util.*; // importing package

public class CitySearch {
    public static void main(String[] args) {
        // creating scanner class for user input
        Scanner sc = new Scanner(System.in);

        // array declaration for cities
        String[] city = new String[10] ;

        // array declaration for STD code
        int[] citystd = new int[10] ;

        // variable declared for finding city
        String target ;

        // prompt to user to enter the cities
        System.out.println("Enter the Cities.");

        for(int i=0 ; i<10 ; i++) {
            city[i] = sc.nextLine();
        }

        // prompt to user to enter cities
        System.out.println("Enter the STD Codes.");

        for(int i=0 ; i<10 ; i++) {
            citystd[i] = sc.nextInt();
        }
        sc.nextLine();

        // prompt to user to enter the city want to search
        System.out.println("Enter the City to Search.");
        target = sc.nextLine();

        boolean found = false ;

        for(int i=0; i<10 ; i++) {
            if(city[i].equalsIgnoreCase(target)) {
                System.out.println("Search Successful for - "+city[i]+" and STD code is - "+citystd[i]);
                found = true ;
                break ;
            }
        }

        if(!found) {
            System.out.println("Search Unsuccessful, no such city in the list.");
        }
    }
}
