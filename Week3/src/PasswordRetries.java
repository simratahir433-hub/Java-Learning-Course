import java.util.Scanner;

public class PasswordRetries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "secret123";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter password: ");
            String input = scanner.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Login Successful!");
                return;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Account locked. Please contact support.");
                }
            }
        }
        scanner.close();
    }
}