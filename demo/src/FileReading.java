import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the filename
        System.out.print("Enter the filename to read: ");
        String filename = scanner.nextLine();

        // Call the readFile method with the user-provided filename
        readFile(filename);

        scanner.close();  // Close the scanner
    }

    // Method to read file content with try-with-resources
    public static void readFile(String filename) {
        // Use try-with-resources to manage BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("File contents of " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line of the file
            }
        } catch (IOException e) {
            // Handle exception if the file is not found or cannot be read
            System.out.println("Error: File not found or cannot be read.");
        }
    }
}
