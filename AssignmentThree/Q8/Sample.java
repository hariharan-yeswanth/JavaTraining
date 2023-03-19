package AssignmentThree.Q8;

/* @author Hariharan
 *  @version 1.0
*/
public class Sample {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {

        // Create s StringBuffer object with value 'A'
        StringBuffer strBuffer = new StringBuffer("A");

        // Create 3 instances of MyClass
        ThreadsTest Thread1 = new ThreadsTest(strBuffer);
        ThreadsTest Thread2 = new ThreadsTest(strBuffer);
        ThreadsTest Thread3 = new ThreadsTest(strBuffer);

        // Call the run method of each of the instances
        Thread1.run();
        Thread2.run();
        Thread3.run();
    }
}

// Class named MyClass that extends Thread class
class ThreadsTest extends Thread {
    StringBuffer strBuff;

    /**
     * Parameterized constructor
     * 
     * @param sBuffer
     */
    ThreadsTest(StringBuffer sBuffer) {
        this.strBuff = sBuffer;
    }

    // Overriding the method run of Thread class
    @Override
    public void run() {
        synchronized (this) {
            for (int index = 0; index < 5; index++) {
                System.out.println(this.strBuff);
            }
            this.strBuff.setCharAt(0, (char) (this.strBuff.charAt(0) + 1));
        }
    }
}
