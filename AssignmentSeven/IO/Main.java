package AssignmentSeven.IO;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Open the input file
            FileInputStream fileIn = new FileInputStream(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/IO/Input.txt");

            // Open the output file
            FileOutputStream fileOut = new FileOutputStream(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/IO/Output.txt");

            // Read bytes from the input file and write them to the output file
            int data = fileIn.read();
            char ch = (char) data;
            System.out.println(ch);
            while (data != -1) {
                fileOut.write(data);
                data = fileIn.read();
                char c = (char) data;
                System.out.println(c);
            }

            // Close the files
            fileIn.close();
            fileOut.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
