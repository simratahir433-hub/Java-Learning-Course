import java.util.Scanner;

public class LoginSimulator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String username;
         String password;
         System.out.print("Enter Username: ");
         username = scanner.nextLine();
         System.out.print("Enter Password: ");
         password = scanner.nextLine();
         
         if (username.equals("admin") && password.equals("admin123")) {            System.out.println("Login Successful!");  
         }
         else{
            System.out.println("Invalid Credentials. Please try again.");

         }
         scanner.close();
        }
}