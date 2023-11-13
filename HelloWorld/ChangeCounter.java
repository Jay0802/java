import java.util.Scanner;

public class ChangeCounter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of quarters
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        // Ask the user for the number of dimes
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        // Ask the user for the number of nickels
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        // Ask the user for the number of pennies
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        // Calculate the total amount in dollars
        double totalAmount = calculateTotalAmount(quarters, dimes, nickels, pennies);

        // Display the total amount in dollars
        System.out.println("You have $" + totalAmount);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to calculate the total amount in dollars
    private static double calculateTotalAmount(int quarters, int dimes, int nickels, int pennies) {
        // Constants representing the values of different coins in dollars
        final double QUARTER_VALUE = 0.25;
        final double DIME_VALUE = 0.10;
        final double NICKEL_VALUE = 0.05;
        final double PENNY_VALUE = 0.01;

        // Calculate the total amount in dollars
        double totalAmount = (quarters * QUARTER_VALUE) + (dimes * DIME_VALUE) +
                (nickels * NICKEL_VALUE) + (pennies * PENNY_VALUE);

        return totalAmount;
    }
}

