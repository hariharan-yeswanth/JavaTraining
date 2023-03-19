package AssignmentThree.Q7;
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
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // Create object for Count class
        Count object = new Count();

        // Execute the thread to Count numbers from 1 to 100
        executorService.execute(() -> {
            for (Count.number = 1; Count.number < 101; Count.number++) {
                object.countNumbers();
            }
        });

        // Execute the thread to display Message after printing every 10 numbers
        executorService.execute(() -> {
            for (int index = 1; index <= 10; index++) {
                object.displayMessage();
            }
            System.exit(0);
        });
        // Shutdown ExecutorService
        executorService.shutdown();
    }
}

class Count {
    static int number;

    // Method to print the numebers
    synchronized public void countNumbers() {
        System.out.print(number + " ");
        try {
            Thread.sleep(1000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        if (number % 10 == 0) {
            notify();
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // Method to print the Message after counting every 10 numbers
    synchronized public void displayMessage() {
        System.out.println("\nCounted ten numbers");
        try {
            notify();
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
