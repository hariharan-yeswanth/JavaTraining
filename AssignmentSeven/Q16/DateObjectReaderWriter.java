package Q16;
// import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.io.FileReader;
// import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
// import java.io.OutputStream;
import java.util.Date;

public class DateObjectReaderWriter {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q16/fileDate.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            Date date = new Date();

            objectOutputStream.writeObject(date);

            FileInputStream fileInputStream = new FileInputStream(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/Q16/fileDate.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            System.out.println(objectInputStream.readObject());

            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
