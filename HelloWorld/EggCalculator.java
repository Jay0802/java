import java.util.Scanner;

public class EggCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of eggs
        System.out.print("Enter the number of eggs: ");
        int numEggs = scanner.nextInt();

        // Calculate the number of gross, dozen, and leftover eggs
        int gross = numEggs / 144;
        int dozen = (numEggs % 144) / 12;
        int leftover = (numEggs % 144) % 12;

        // Display the result
        System.out.println("Your number of eggs is " + gross + " gross, " +
                dozen + " dozen, and " + leftover + " leftover");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
