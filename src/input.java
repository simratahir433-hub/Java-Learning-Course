import java.util.Scanner;

public class input {
    public static void main (String[] args){
        Scanner scanner= new Scanner (System.in);
        String name;
        int age;
        System.out.print("Enter your name:");
        name= scanner.nextLine();
        System.out.print("Enter your age:");
        age= scanner.nextInt();
        scanner.close();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

    }
}
