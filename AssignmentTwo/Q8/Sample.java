package AssignmentTwo.Q8;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        for (int index = 0; index < 5; index++) {
            try {
                System.out.printf("Enter the mark of students %d:", index + 1);
                String input = scan.nextLine();
                marks[index] = Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                System.out.print("Press enter and Please enter the valid mark");
                scan.nextLine();
                index--;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Float TotalMarks = 0f;
        for (int index = 0; index < 5; index++) {
            TotalMarks += marks[index];
        }
        Float averageMark = TotalMarks / 5;
        System.out.printf("The average mark of 10 students is %f", averageMark);
        scan.close();

    }
}
