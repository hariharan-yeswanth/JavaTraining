package AssignmentThree.Q3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create object for Inventory class
        Inventory inventoryObject = new Inventory();
        // Create Thread Pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Execute the thread to produce item
        executorService.execute(() -> {
            for (int iterationVariable = 1; iterationVariable <= 2; iterationVariable++) {
                inventoryObject.produce(iterationVariable);
            }
        });

        // Execute the thread to consume item
        executorService.execute(() -> {
            for (int iterationVariable = 1; iterationVariable <= 2; iterationVariable++) {
                inventoryObject.consume(iterationVariable);
            }
        });

        // Shutdown ExecutorService
        executorService.shutdown();
    }
}

class Inventory {
    // Flag variable to indicate Item status
    boolean flag = false;

    // method to produce item
    synchronized public void produce(int itemId) {
        if (flag) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        flag = !flag;
        System.out.println("Item" + itemId + " Produced");
        notify();
    }

    // Method to consume item
    synchronized public void consume(int itemId) {
        if (!flag) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        flag = !flag;
        System.out.println("Item" + itemId + " consumed");
        notify();
    }
}
