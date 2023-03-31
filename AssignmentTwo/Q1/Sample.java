package AssignmentTwo.Q1;

import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws Exception {
        /*
         * An exception is threw but not handled and the method is not informed that an
         * exception will be thrown
         */
        throw new IOException();
    }
}
