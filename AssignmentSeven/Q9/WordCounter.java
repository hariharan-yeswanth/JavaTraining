import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the words :");
        String givenString = scanner.nextLine();
        int count = 1;
        for (int i = 0; i < givenString.length() - 1; i++) {
            if ((givenString.charAt(i) == ' ') && (givenString.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println("Number of words :" + count);
        scanner.close();

    }
}
