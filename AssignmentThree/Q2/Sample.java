package AssignmentThree.Q2;

/** @author Hariharan
 *  @version 1.0
 */

/** Import required packages
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
    /**
     * 
     * @param args
     * @return null
     */

    public static void main(String[] args) {
        // Create Thread Pool
        ExecutorService exe = Executors.newFixedThreadPool(5);

        // Create object for Sample class
        Sample obj = new Sample();

        // Execute the thread to print Open Paranthesis
        exe.execute(() -> {
            obj.openParanthesis();
        });
        // Execute the thread to print hyphen
        exe.execute(() -> {
            for (int counter = 0; counter < 6; counter++) {
                obj.hyphen();
            }
        });
        // Execute the thread to print Message
        exe.execute(() -> {
            obj.displayMessage();
        });
        // Execute the thread to print hyphen
        exe.execute(() -> {
            for (int counter = 0; counter < 6; counter++) {
                obj.hyphen();
            }
        });
        // Execute the thread to print close Paranthesis
        exe.execute(() -> {
            obj.closeParanthesis();
        });
        // Shutdown ExecutorService
        exe.shutdown();
    }

    synchronized public void openParanthesis() {
        System.out.print("[");
    }

    synchronized public void hyphen() {
        System.out.print("-");
    }

    synchronized public void displayMessage() {
        System.out.print("Message");
    }

    synchronized public void closeParanthesis() {
        System.out.println("]");
    }
}