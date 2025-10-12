public class MaxFinder {

    // Method to find max between two int values
    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to find max between two double values
    public static double findMax(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int intNum1 = 10;
        int intNum2 = 25;
        double doubleNum1 = 12.5;
        double doubleNum2 = 7.8;

        // Calling overloaded methods
        int maxInt = findMax(intNum1, intNum2);
        double maxDouble = findMax(doubleNum1, doubleNum2);

        // Printing the results
        System.out.println("Max of " + intNum1 + " and " + intNum2 + " is: " + maxInt);
        System.out.println("Max of " + doubleNum1 + " and " + doubleNum2 + " is: " + maxDouble);
    }
}
