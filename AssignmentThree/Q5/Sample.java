package AssignmentThree.Q5;

public class Sample implements Runnable {

    @Override
    public void run() {
        System.out.println("in run() method, method completed.");
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        Thread thread1 = new Thread();
        thread1.start();
        thread1.start(); // will throw java.lang.IllegalThreadStateException at runtime
    }

}
