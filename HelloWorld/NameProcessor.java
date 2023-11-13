import java.util.Scanner;

public class NameProcessor {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their first name and last name
        System.out.println("Please enter your first name and last name, separated by a space:");
        String fullName = scanner.nextLine();

        // Find the position of the space in the input string
        int spaceIndex = fullName.indexOf(" ");

        // Extract the first name and last name using substring
        String firstName = fullName.substring(0, spaceIndex);
        String lastName = fullName.substring(spaceIndex + 1);

        // Output the information
        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + lastName + ", which has " + lastName.length() + " characters");

        // Output the user's initials
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Your initials are " + firstInitial + lastInitial);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

