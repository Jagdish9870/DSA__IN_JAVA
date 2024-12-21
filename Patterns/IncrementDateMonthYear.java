import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IncrementDateMonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input format: "12 December 2024"
        System.out.print("Enter the starting date (e.g., 12 December 2024): ");
        String input = scanner.nextLine();

        // Convert the input string to a LocalDate object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate date = LocalDate.parse(input, formatter);

        System.out.println("Five consecutive dates with both day, month, and year incremented if necessary:");

        // Print 5 consecutive dates
        for (int i = 0; i < 5; i++) {
            System.out.println(date.format(formatter)); // Format and print the date
            date = date.plusDays(1).plusMonths(1); // Increment both day and month
        }

        scanner.close();
    }
}
