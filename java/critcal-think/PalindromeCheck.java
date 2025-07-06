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
        StringBuilder string_reverse = new StringBuilder();

        for (int i = sentence_length - 1; i >= 0; i--) {
            string_reverse.append(clean_sentence.charAt(i));
        }
        String reveresd_sentence = string_reverse.toString();

        if (clean_sentence.equals(reveresd_sentence)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

        scanner.close();
    }
}
