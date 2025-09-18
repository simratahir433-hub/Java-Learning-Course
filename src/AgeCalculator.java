import java.util.Scanner;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = Year.now().getValue();

        // Calculate approximate age
        int age = currentYear - birthYear;

        // Print the result
        System.out.println("You are approximately " + age + " years old.");
        
        scanner.close();
    }
}
