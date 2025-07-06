import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;

public class TypeSpeed {
    public static void main(String[] args) {
        String originalText = "The quick brown fox jumps over the lazy dog";
        System.out.println("Type this sentence exactly:");
        System.out.println("\"" + originalText + "\"");

        GetTypingTimer result = getInputAndTiming();

        double accuracy = calculateAccuracy(originalText, result.user_input);

        System.out.println("Time taken: " + result.time_takenMillis + " ms");
        System.out.println("Accuracy: " + String.format("%.2f", accuracy) + "%");
    }

    public static GetTypingTimer getInputAndTiming() {
        Scanner scanner = new Scanner(System.in);

        Instant start = Instant.now();

        System.out.print("> ");
        String input = scanner.nextLine();

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        long millis = duration.toMillis();

        scanner.close();

        return new GetTypingTimer(input, millis);
    }

    public static double calculateAccuracy(String target, String typed) {
        target = target.toLowerCase();
        typed = typed.toLowerCase();

        int correctChars = 0;
        int lengthToCompare = Math.min(target.length(), typed.length());

        for (int i = 0; i < lengthToCompare; i++) {
            if (target.charAt(i) == typed.charAt(i)) {
                correctChars++;
            }
        }

        return ((double) correctChars / target.length()) * 100;
    }
}
