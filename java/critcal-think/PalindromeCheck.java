import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plese enter the sentence you want to check Palindrome: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.err.println("Empty input");
            scanner.close();
            return;
        }

        String lower_sentence = sentence.toLowerCase();
        String clean_sentence = lower_sentence.replaceAll("[^a-zA-Z]", "");
        int sentence_length = clean_sentence.length();
        String reveresd = "";

        for (int i = sentence_length - 1; i >= 0; i--) {
            reveresd += clean_sentence.charAt(i);
        }

        if (clean_sentence.equals(reveresd)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        scanner.close();
    }
}
