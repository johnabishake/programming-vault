import java.util.Scanner;

public class HelloWhoIsIT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your First name:");
        String name = scanner.nextLine().trim();
        int nameLength = name.length();

        if (name.isEmpty()) {
            System.out.println("You didn't enter anything! are you a alien?");
        }

        if (!name.matches("[a-zA-Z]+")) {
            System.err.println("Invalid name: " + name);
            scanner.close();
            return;
        }

        // Checks for vowels
        int vowelCount = 0;
        String lowerCaseName = name.toLowerCase();
        for (int i = 0; i < lowerCaseName.length(); i++) {
            char letter = lowerCaseName.charAt(i);
            if ("aeiou".indexOf(letter) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Hello! " + name + ", Good to meet you. You have a " + nameLength + " letter name and "
                + vowelCount + " vowels.");

        scanner.close();
    }
}
