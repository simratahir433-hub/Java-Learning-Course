import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is a leap year."); // Rule 1
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year."); // Rule 2
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year."); // Rule 3
        } else {
            System.out.println(year + " is not a leap year."); // Rule 4
        }

        scanner.close();
    }
}
