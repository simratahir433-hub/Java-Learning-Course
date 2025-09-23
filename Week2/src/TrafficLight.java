import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a traffic light color (red, yellow, green): ");
        String color = scanner.nextLine().toLowerCase(); // convert input to lowercase

        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Slow Down");
        } else if (color.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color. Please enter red, yellow, or green.");
        }

        scanner.close();
    }
}
