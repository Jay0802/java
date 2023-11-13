import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamScoreProcessor {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "testdata.txt";

        try {
            // Create a File object representing the input file
            File file = new File(filePath);

            // Create a Scanner object to read from the file
            Scanner fileScanner = new Scanner(file);

            // Read the student's name from the first line
            String studentName = fileScanner.nextLine();

            // Read the scores for three exams
            int exam1 = fileScanner.nextInt();
            int exam2 = fileScanner.nextInt();
            int exam3 = fileScanner.nextInt();

            // Calculate the average grade
            double averageGrade = (exam1 + exam2 + exam3) / 3.0;

            // Display the information
            System.out.println("Student: " + studentName);
            System.out.println("Average Grade: " + averageGrade);

            // Close the scanner to prevent resource leak
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }
}

