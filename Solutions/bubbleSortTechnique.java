import java.util.Scanner; // Correct import statement

public class bubbleSortTechnique { // Class name should ideally start with an uppercase letter (e.g., Abc)
    char[] a = new char[10]; // Array declaration for characters

    // Method to take character input from the user
    public void input_characters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Characters:");

        // For loop to take input
        for (int i = 0; i < 10; i++) {
            a[i] = sc.next().charAt(0); // Read the first character of user input
        }
    }

    // Method to arrange characters using bubble sort
    public void sort_characters() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) { // Compare a[j] and a[j + 1] for sorting
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Method to display the array
    public void display() {
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Main method to execute the program
    public static void main(String[] args) {
        bubbleSortTechnique object = new bubbleSortTechnique();

        object.input_characters();

        // Print original array
        System.out.println("Original Array:");
        object.display();

        object.sort_characters();

        // Print sorted array
        System.out.println("Sorted Array:");
        object.display();
    }
}

