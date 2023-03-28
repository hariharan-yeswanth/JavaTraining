package AssignmentSeven.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/IO/Input.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/IO/Output.txt");
        int numberOfCharactersRead = 0;
        byte buffer[] = new byte[8];
        while ((numberOfCharactersRead = fileInputStream.read(buffer)) != -1) {
            String string = new String(buffer, 0, numberOfCharactersRead);
            System.out.println(string);
            fileOutputStream.write(buffer, 0, numberOfCharactersRead);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
