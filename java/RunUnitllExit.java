import java.util.Scanner;

public class RunUnitllExit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your First name or Exit to quit: ");
            String name = scanner.nextLine().trim();
            int nameLength = name.length();
            if (name.equalsIgnoreCase("Exit")) {
                System.out.println("Thanks for your patience!");
                break;
            }
            if (name.isEmpty()) {
                System.out.println("You didn't enter anything! are you a alien? Try again....");
                continue;
            }

            if (!name.matches("[a-zA-Z ]+")) {
                System.err.println("Invalid name: " + name + ".Try again....");
                continue;
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

        }
        scanner.close();

    }
}
