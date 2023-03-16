package Io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class CopyCommand {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("data.txt");
        FileOutputStream fos = new FileOutputStream("copydata.txt");
        int i = 0;
        byte b[] = new byte[8];
        while ((i = fis.read(b)) != -1) {
            String s = new String(b, 0, i);
            System.out.println(s);
            fos.write(b, 0, i);
        }

    }
}
