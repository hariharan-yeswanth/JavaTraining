package AssignmentThree.Q1;

public class Sample {
    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}

class Runnable2 implements Runnable {
    public void run() {
        System.out.println("The Odd numbers from 1 to 100 are: ");
        for (int index = 1; index <= 100; index++) {
            if (index % 2 != 0) {
                System.out.print(index+" ");
            }
        }
    }
}

class Runnable1 implements Runnable {
    public void run() {
        System.out.println("The Even numbers from 1 to 100 are: ");
        for (int index = 1; index <= 100; index++) {
            if (index % 2 == 0) {
                System.out.print(index+" ");
            }
        }
    }
}
