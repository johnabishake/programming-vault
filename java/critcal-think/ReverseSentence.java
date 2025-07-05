import java.util.Scanner;

public class ReverseSentence {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Plese enter the sentence you want to reverse: ");
        String sentence = scanner.nextLine().trim();

        if (sentence.isEmpty()) {
            System.err.println("Empty input");
        }

        String[] convert_string = sentence.split(" ");
        int words_length = convert_string.length;
        System.out.println("Reversed sentence is: ");
        for (int i = words_length - 1; i >= 0; i--) {
            System.out.print(convert_string[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }

}
