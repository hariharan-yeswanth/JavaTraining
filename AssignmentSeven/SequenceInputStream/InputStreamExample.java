package AssignmentSeven.SequenceInputStream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

class InputStreamExample {
    public static void main(String args[]) throws Exception {
        FileInputStream input1 = new FileInputStream(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/SequenceInputStream/testin.txt");
        FileInputStream input2 = new FileInputStream(
                "/Users/hariharansaravanan/Documents/JAVA/Learning/AssignmentSeven/SequenceInputStream/testout.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
