import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class fileCopier {
    public static void main(String[] args) {

        try (Reader reader = new FileReader(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q14/fileSource.txt");
                Writer writer = new FileWriter(
                        "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q14/fileDestination.txt")) {
            int i;
            while ((i = reader.read()) != -1) {

                writer.write(i);
            }
            System.out.println("File copied successfully....");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
