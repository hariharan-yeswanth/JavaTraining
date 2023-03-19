package AssignmentThree.Q5;

/**
 * @author Hariharan
 * @version 1.0
 */
public class Sample {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create object for MyClass
        ThreadDemo classObject = new ThreadDemo();

        // Start the thread
        classObject.start();

        // Start the thread
        // classObject.start();
    }
}

// Class MyClass that extends Thread Class
class ThreadDemo extends Thread {

    // Overriding the method run from Thread class
    @Override
    public void run() {
        System.out.println("Thread started.");
    }
}