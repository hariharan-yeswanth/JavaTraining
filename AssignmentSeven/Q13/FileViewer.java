import java.io.FileReader;
import java.io.FileWriter;

public class FileViewer {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q13/fileRead.txt");

            int i = 0;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {

        }
    }

}