import java.io.FileReader;
import java.io.FileWriter;

public class fileCopier {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q14/fileSource.txt");
            FileWriter fileWriter = new FileWriter(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q14/fileDestination.txt");

            char charArray[] = new char[64];
            int i = 0;
            while ((i = fileReader.read(charArray)) != -1) {
                String copiedData = new String(charArray, 0, i);
                System.out.println(copiedData);
                fileWriter.write(copiedData);
            }

            fileWriter.close();
            fileReader.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

}