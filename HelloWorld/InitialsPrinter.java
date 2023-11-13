public class InitialsPrinter {
    public static void main(String[] args) {
        printInitialJ();
        System.out.println(); // Voeg een lege regel toe tussen de initialen
        printInitialS();
    }

    public static void printInitialJ() {
        System.out.println("      *  ");
        System.out.println("      *  ");
        System.out.println("      *  ");
        System.out.println("      *  ");
        System.out.println("      *  ");
        System.out.println(" *    *  ");
        System.out.println(" *    *  ");
        System.out.println("  * * *  ");
    }

    public static void printInitialS() {
        System.out.println("  *****  ");
        System.out.println(" *      ");
        System.out.println(" *      ");
        System.out.println("  *****  ");
        System.out.println("       * ");
        System.out.println("       * ");
        System.out.println(" *****  ");
    }
}
