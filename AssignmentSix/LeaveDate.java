package AssignmentSix;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hariharan
 * @version 1.0
 * 
 */

public class LeaveDate {
    // Creating a new ArrayList of LocalDateTime objects to store leave dates
    public static List<LocalDateTime> leaveDates = new ArrayList<>();

    public static void addLeaveDate(LocalDateTime dateTime) {
        leaveDates.add(dateTime);
    }

    // Function to check if the date is a leave date
    public static boolean isLeaveDate(LocalDateTime dateTime) {
        return leaveDates.contains(dateTime);
    }

    public static void loadLeaves() {
        LeaveDate.addLeaveDate(LocalDateTime.of(2023, Month.JANUARY, 1, 0, 0));
        LeaveDate.addLeaveDate(LocalDateTime.of(2023, Month.JANUARY, 26, 0, 0));
        LeaveDate.addLeaveDate(LocalDateTime.of(2023, Month.AUGUST, 15, 0, 0));
    }
}
