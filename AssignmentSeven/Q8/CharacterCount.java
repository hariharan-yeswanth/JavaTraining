
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int countOfchars = 0;

            while (true) {
                System.out.println("Please enter a character: ");
                char character = scanner.next().charAt(0);

                countOfchars++;

                if (character == 'q')
                    break;
            }
            System.out.println("No. of characters entered: " + countOfchars);
        }
    }

}
