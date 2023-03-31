package AssignmentTwo.Q9;

import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException() {
        System.out.println("Please enter a positive number");
    }
}

class OutOfRangeException extends Exception {
    OutOfRangeException() {
        System.out.println("Please enter the mark between 0 and 100");
    }
}

public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        for (int index = 0; index < 5; index++) {
            try {
                System.out.printf("Enter the mark of students %d:", index + 1);
                String input = scan.nextLine();
                marks[index] = Integer.parseInt(input);
                if (marks[index] < 0) {
                    throw new NegativeNumberException();
                }
                if (marks[index] > 100) {
                    throw new OutOfRangeException();
                }
            } catch (NumberFormatException nfe) {
                System.out.print("Press enter and Please enter the valid mark");
                scan.nextLine();
                index--;
            } catch (OutOfRangeException oore) {
                oore.printStackTrace();
            } catch (NegativeNumberException nne) {
                nne.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            // index--;
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
