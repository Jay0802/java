import java.util.Scanner;

public class GreetingProgram {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

        // Convert the user's name to uppercase
        String upperCaseName = userName.toUpperCase();

        // Display the greeting with the uppercase name
        System.out.println("Hello, " + upperCaseName + ", nice to meet you!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
