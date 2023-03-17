package AssignmentThree.Q2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newFixedThreadPool(5);
        Sample obj = new Sample();
        exe.execute(() -> {
            obj.openParanthesis();
        });
        exe.execute(() -> {
            for (int counter = 0; counter < 6; counter++) {
                obj.hyphen();
            }
        });
        exe.execute(() -> {
            obj.displayMessage();
        });
        exe.execute(() -> {
            for (int counter = 0; counter < 6; counter++) {
                obj.hyphen();
            }
        });
        exe.execute(() -> {
            obj.closeParanthesis();
        });
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
