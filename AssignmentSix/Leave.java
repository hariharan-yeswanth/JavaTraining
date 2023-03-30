package AssignmentSix;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * @author Hariharan
 * @version 1.0
 * 
 */

public class Leave {

    public static int isLeaveDay(LocalDateTime date) {
        // Condition to check if the date is a second saturday
        if (date.getDayOfMonth() > 7 && date.getDayOfMonth() < 15 && date.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return 2;
        }
        // Function to check if the date is either sunday or specified leave days
        else if (date.getDayOfWeek() == DayOfWeek.SUNDAY || LeaveDate.isLeaveDate(date)) {
            return 1;
        } else {
            return 0;
        }
    }
}
