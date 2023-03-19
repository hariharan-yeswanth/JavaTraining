package AssignmentThree.Q3;
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

        // Create object for Inventory class
        Inventory inventoryObject = new Inventory();

        // Execute the thread to produce thread
        executorService.execute(() -> {
            for (int index = 1; index <= 2; index++) {
                inventoryObject.produce(index);
            }
        });

        // Execute the thread to consume thread
        executorService.execute(() -> {
            for (int index = 1; index <= 2; index++) {
                inventoryObject.consume(index);
            }
        });

        // Shutdown ExecutorService
        executorService.shutdown();
    }
}

class Inventory {
    int count = 0;

    // method to produce item
    synchronized public void produce(int itemId) {
        if (count == 1) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Item Produced");
        count = 1;
        notify();
    }

    // Method to consume item
    synchronized public void consume(int itemId) {
        if (count == 0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        count = 0;
        System.out.println("Item Consumed");
        notify();
    }
}
