public class CalculatorApp {

    public static int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }

    // Method to calculate quotient of two doubles
    public static double calculateQuotient(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0; // return 0 if dividing by zero
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 4;

        double x = 15.0;
        double y = 3.0;

        int product = calculateProduct(a, b);
        double quotient = calculateQuotient(x, y);

        System.out.println("The product of " + a + " and " + b + " is: " + product);
        System.out.println("The quotient of " + x + " and " + y + " is: " + quotient);
    }
}
