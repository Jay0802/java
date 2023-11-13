public class DiceRollSimulator {

    public static void main(String[] args) {
        // Simulate rolling the first die
        int firstDie = rollDie();

        // Simulate rolling the second die
        int secondDie = rollDie();

        // Calculate the total roll
        int totalRoll = firstDie + secondDie;

        // Display the results
        System.out.println("The first die comes up " + firstDie);
        System.out.println("The second die comes up " + secondDie);
        System.out.println("Your total roll is " + totalRoll);
    }

    // Method to simulate rolling a single die
    private static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}

