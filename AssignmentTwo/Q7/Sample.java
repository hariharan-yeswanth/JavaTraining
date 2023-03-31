package AssignmentTwo.Q7;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the numerator:");
            String str = scan.nextLine();
            if (str.charAt(0) == 'q' || str.charAt(0) == 'Q') {
                break;
            }
            int num = Integer.parseInt(str);
            System.out.println("Enter the Denominator");
            int deno = scan.nextInt();
            scan.nextLine();
            try {
                System.out.println("The value of num/div is :");
                System.out.println(num / deno);
            } catch (ArithmeticException ae) {
                ae.printStackTrace();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        scan.close();
    }
}
