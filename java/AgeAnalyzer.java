import java.util.Scanner;

public class AgeAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your Date of birth or Exit to quit: ");
            String ageInput = scanner.nextLine().trim();
            if (ageInput.equalsIgnoreCase("Exit")) {
                System.out.println("Thanks for trying this CLI!");
                break;
            }
            if (ageInput.isEmpty()) {
                System.out.println("You didn't enter anything! are you a alien? Try again....");
                continue;
            }

            if (!ageInput.matches("\\d+")) {
                System.err
                        .println("Age must be numeric" + ageInput.getClass().getSimpleName() + "given. Try again....");
                continue;
            }

            int age = Integer.parseInt(ageInput);
            if (age < 0 || age > 150) {
                System.err.println("Look's like the age is not real.");
                continue;
            }

            System.out.println("- You are " + age + " years old.");
            int yearsTo100 = 100 - age;
            if (yearsTo100 > 0) {
                System.out.println("- " + yearsTo100 + " years to reach 100.");
            } else if (yearsTo100 == 0) {
                System.out.println("- Congrats on being exactly 100!");
            } else {
                System.out.println("- You've passed 100 by " + (-yearsTo100) + " years.");
            }

            System.out.println("- Minor: " + (age < 18 ? "Yes" : "No"));
            System.out.println("- Adult: " + (age >= 18 && age < 60 ? "Yes" : "No"));
            System.out.println("- Senior: " + (age >= 60 ? "Yes" : "No"));
            System.out.println();

        }
        scanner.close();

    }
}
