package Q15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LineByLineCopier {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q15/sourcefile.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter(
                        "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q15/destinationfile.txt"))) {
            String string;
            int count = 0;
            while ((string = reader.readLine()) != null) {
                if (count == 3)
                    break;
                writer.write(string);
                writer.newLine();
                count++;
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
