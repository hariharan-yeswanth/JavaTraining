package AssignmentThree.Q6;

/** @author Hariharan
 *  @version 1.0
 */

/** Import required packages
 */
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create object for MyClass
        Alphabetic alpha = new Alphabetic();
        // Create Thread Pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Execute the thread to get Input
        executorService.execute(() -> {
            synchronized (alpha) {
                alpha.getInput();
            }
        });

        // Execute the thread to display message if Exception
        executorService.execute(() -> {
            synchronized (alpha) {
                while (true) {
                    alpha.displayMessageIfExceptionOccurs();
                }
            }
        });
        // Shutdown ExecutorService
        executorService.shutdown();
    }
}

class Alphabetic {
    private char character;
    Scanner sc = new Scanner(System.in);

    // Method to get Input using Scanner
    public void getInput() {
        while (sc.hasNext()) {
            character = sc.next().charAt(0);
            if (!Character.isAlphabetic(character)) {
                notify();
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Method to display Exception message
    public void displayMessageIfExceptionOccurs() {
        System.out.println("The Input '" + this.character + "' is not a alphabet");
        notify();
        try {
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
