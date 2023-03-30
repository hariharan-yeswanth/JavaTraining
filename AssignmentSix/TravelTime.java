package AssignmentSix;

import java.time.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hariharan
 * @version 1.0
 * 
 */

public class TravelTime {

    /**
     * 
     * @param args
     * @return null
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Load the leave dates.
        LeaveDate.loadLeaves();

        // Get speed of lorry from the user
        System.out.println("Enter the speed of lorry (kmph): ");
        int speed = Integer.parseInt(scanner.nextLine());

        // Asking the user to enter the distance in km.
        System.out.println("Enter the distance (km): ");
        int distance = Integer.parseInt(scanner.nextLine());

        // Asking the user to enter the starting date in the format DD-MM-YYYY.
        System.out.println("Enter the starting date (DD-MM-YYYY): ");
        String dateString = scanner.nextLine();
        String[] date = dateString.split("-");
        System.out.println(Arrays.toString(date));

        // This is converting the date string array into a LocalDate object.
        LocalDate departureDate = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]),
                Integer.parseInt(date[0]));

        // Parsing the time entered by the user and converting it into a LocalTime
        // object.
        System.out.println("Enter the starting time (HH:MM): ");
        LocalTime departureTime = LocalTime.parse(scanner.next());

        scanner.close();

        System.out.println("The lorry starts at " + departureDate.getDayOfMonth() + "/" + departureDate.getMonthValue()
                + "/" + departureDate.getYear()
                + " at " + departureTime.getHour() + ":" + departureTime.getMinute());

        // Calculating the number of days to be travelled.
        int daysToBeTravelled = (distance / speed) / 8;
        // Calculating the number of remaining hours to be travelled.
        int hoursToBeTravelled = (distance / speed) % 8;

        // Creating a LocalDateTime object with the departureDate and departureTime.
        LocalDateTime travelDateTime = LocalDateTime.of(departureDate, departureTime);

        // This is a while loop that will run until the daysToBeTravelled is greater
        // than 0. meanwhile skipping the leave days.
        while (daysToBeTravelled > 0) {
            int days = Leave.isLeaveDay(travelDateTime);
            if (days > 0) {
                travelDateTime = travelDateTime.plusDays(days);
            } else {
                travelDateTime = travelDateTime.plusDays(1);
                daysToBeTravelled -= 1;
            }
        }

        travelDateTime = travelDateTime.plusHours(hoursToBeTravelled);

        // If the date of arrival is going to be a leave day, then skip the days
        // accordingly
        int lastDayTravel = Leave.isLeaveDay(travelDateTime);
        if (lastDayTravel > 0) {
            travelDateTime = travelDateTime.plusDays(lastDayTravel);
        } else {
            travelDateTime = travelDateTime.plusDays(1);
        }

        // Print the arrival date and time.
        System.out.println("The lorry will reach on " + travelDateTime.getDayOfMonth() + "/"
                + travelDateTime.getMonthValue() + "/"
                + travelDateTime.getYear() + " at "
                + travelDateTime.getHour() + ":"
                + travelDateTime.getMinute());
    }
}
