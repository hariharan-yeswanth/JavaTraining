package AssignmentSeven.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream(
                    "/Users/hariharansaravanan/Documents/JAVA/Learning/JDBC/jdbc/AssignmentSeven/BufferedInputStream/testout.text");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
            bin.close();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
