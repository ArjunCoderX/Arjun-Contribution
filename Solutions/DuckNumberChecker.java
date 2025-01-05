import java.util.Scanner;

public class DuckNumberChecker {

    // Method to check if the number is a Duck Number
    public static boolean isDuckNumber(int num) {
        // Convert number to a string
        String numStr = Integer.toString(num);

        // Duck Number should not start with zero
        if (numStr.charAt(0) == '0') {
            return false;
        }

        // Check if it contains the digit '0'
        return numStr.contains("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        // Validate if the number is a 3-digit number
        if (num < 100 || num > 999) {
            System.out.println("Invalid");
        } else {
            // Check if it's a Duck Number
            if (isDuckNumber(num)) {
                System.out.println("Duck number");
            } else {
                System.out.println("Not a Duck number");
            }
        }
        sc.close();
    }
}
