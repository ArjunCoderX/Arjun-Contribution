import java.util.*;

public class student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students.");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] rollnum = new int[n];
        int[] marks1 = new int[n];
        int[] marks2 = new int[n];
        int[] marks3 = new int[n];

        double[] avg = new double[n];

        System.out.println("Enter the Data of students.");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name.");
            sc.nextLine(); // Consume leftover newline
            name[i] = sc.nextLine();

            System.out.println("Enter the roll number.");
            rollnum[i] = sc.nextInt();

            System.out.println("Enter the Marks in subject 1.");
            marks1[i] = sc.nextInt();

            System.out.println("Enter the Marks in subject 2.");
            marks2[i] = sc.nextInt();

            System.out.println("Enter the Marks in subject 3.");
            marks3[i] = sc.nextInt();

            avg[i] = (marks1[i] + marks2[i] + marks3[i]) / 3.0; // Ensure floating-point division
        }

        System.out.println("\nStudents Details Are as follows:");

        for (int i = 0; i < n; i++) {
            System.out.println("Name : " + name[i]);
            System.out.println("Roll no. : " + rollnum[i]);
            System.out.println("Subject 1 Marks : " + marks1[i]);
            System.out.println("Subject 2 Marks : " + marks2[i]);
            System.out.println("Subject 3 Marks : " + marks3[i]);
            System.out.println("Average Marks : " + avg[i]);
            System.out.println("Remarks : " + getremark(avg[i]));
        }

        sc.close(); // Close scanner
    }

    public static String getremark(double avg) {
        if (avg < 40) {
            return "POOR";
        } else if (avg >= 40 && avg <= 59) {
            return "Pass";
        } else if (avg >= 60 && avg <= 74) {
            return "First Class"; // Corrected typo
        } else if (avg >= 75 && avg <= 84) {
            return "Distinction";
        } else {
            return "Excellent";
        }
    }
}
