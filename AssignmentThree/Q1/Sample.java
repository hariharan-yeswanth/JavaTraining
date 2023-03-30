package AssignmentThree.Q1;

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

        // Create object for Sample class
        Sample object = new Sample();

        // Execute the thread to print Odd Numbers
        executorService.execute(() -> {
            Thread.currentThread().setName("Odd Numbers: ");
            object.printNumbers(1);

        });

        // Execute the thread to print Even Numbers
        executorService.execute(() -> {
            Thread.currentThread().setName("Even Numbers: ");
            object.printNumbers(2);
        });

        // Shutdown ExecutorService
        executorService.shutdown();

    }

    synchronized public void printNumbers(int number) {

        // Print name of currentThread
        System.out.println(Thread.currentThread().getName());

        // Print values
        for (; number <= 100; number += 2) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}