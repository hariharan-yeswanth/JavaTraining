package AssignmentThree.Q4;

/** @author Hariharan
 *  @version 1.0
 */

/** Import required packages
 */
import java.time.LocalDateTime;
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
        // Create object for Clock class
        Clock clock = new Clock();

        // Execute the thread to Update time
        executorService.execute(() -> {
            synchronized (clock) {
                while (true) {
                    LocalDateTime ldt = LocalDateTime.now();
                    clock.updateTime(ldt);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        // Execute the thread to display date and time
        executorService.execute(() -> {
            synchronized (clock) {
                while (true) {
                    clock.displayTime();
                }
            }
        });
        // Shutdown ExecutorService
        executorService.shutdown();
    }
}

class Clock {
    private int hour;
    private int minute;
    private int second;
    // private int day;
    // private int month;
    // private int year;

    // Method for clock to update the time
    synchronized public void updateTime(LocalDateTime ldt) {
        this.hour = ldt.getHour();
        this.minute = ldt.getMinute();
        this.second = ldt.getSecond();
        // this.day = ldt.getDayOfMonth();
        // this.month = ldt.getMonthValue();
        // this.year = ldt.getYear();
        try {
            notify();
            wait();
        } catch (Exception e) {
            e.printStackTrace();
            //
        }
    }

    // Method to display the date and time
    synchronized public void displayTime() {
        // System.out.println("Date : Day" + this.day + "/" + "Month" + this.month + "/"
        // + "Year" +
        // this.year);
        System.out.println("Time: Hours" + this.hour + ":" + "Minutes" + this.minute + ":" + "Seconds" + this.second);
        notify();
        try {
            wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
