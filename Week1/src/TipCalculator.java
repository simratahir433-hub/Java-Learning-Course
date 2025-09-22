import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for bill amount
        System.out.print("Enter bill amount: ");
        double bill = scanner.nextDouble();

        // Default 15% tip
        double tip = bill * 0.15;
        double total = bill + tip;

        System.out.println("\n--- Tip Calculator ---");
        System.out.printf("Bill Amount: %.2f%n", bill);
        System.out.printf("15%% Tip: %.2f%n", tip);
        System.out.printf("Total Amount: %.2f%n", total);

        // Bonus: Ask for custom tip percentage
        System.out.print("\nEnter custom tip percentage: ");
        double customPercent = scanner.nextDouble();

        double customTip = bill * (customPercent / 100);
        double customTotal = bill + customTip;

        System.out.printf("%nCustom Tip (%.0f%%): %.2f%n", customPercent, customTip);
        System.out.printf("Total with Custom Tip: %.2f%n", customTotal);

        scanner.close();
    }
}