import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeAnalyzerByDOB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth (yyyy-mm-dd): ");
        String dobInput = scanner.nextLine().trim();
        try {
            LocalDate dob = LocalDate.parse(dobInput);
            LocalDate today = LocalDate.now();
            Period periodDiff = Period.between(dob, today);

            if (dob.isAfter(today)) {
                System.err.println("You are not born yet!");
                scanner.close();
                return;
            }

            System.out
                    .println("Your are " + periodDiff.getYears() + " years, " + periodDiff.getMonths() + " months and "
                            + periodDiff.getDays() + " days old");
        } catch (Exception e) {
            System.err.println("Invalid date format! use yyy-mm-dd");
        }
        scanner.close();

    }
}
