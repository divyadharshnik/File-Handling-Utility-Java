import java.io.*;

public class FileHandlingUtility {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        // 1. Write data to file (Create + Write)
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is File Handling Utility Program.\n");
            writer.write("CODTECH Internship - Task 1\n");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // 2. Read data from file
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // 3. Modify file (Append data)
        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("This line is appended to the file.\n");
            writer.close();
            System.out.println("\nFile modified successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file.");
        }
    }
}
