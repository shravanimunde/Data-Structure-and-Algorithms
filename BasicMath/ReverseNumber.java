import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter the number");

        // Store the entered number
        int number = sc.nextInt();

        // This variable will store the final reversed number
        // Initially it is 0 because we haven't reversed anything yet
        int reverse = 0;

        // Keep looping until all digits are removed
        while (number > 0) {

            // Take the last digit of the current number
            // Example:
            // 1234 % 10 = 4
            // 123 % 10 = 3
            int lastDigit = number % 10;

            // Build the reversed number
            //
            // reverse * 10 -> Makes space for the new digit
            // + lastDigit -> Adds the extracted digit
            //
            // Example:
            // reverse = 4
            // lastDigit = 3
            //
            // 4 * 10 = 40
            // 40 + 3 = 43
            reverse = reverse * 10 + lastDigit;

            // Remove the last digit from the number
            //
            // Example:
            // 1234 / 10 = 123
            // 123 / 10 = 12
            // 12 / 10 = 1
            // 1 / 10 = 0
            //
            // Notice:
            // 'number' changes after every iteration.
            number = number / 10;
        }

        // Print the final reversed number
        System.out.println(reverse);

        // Close Scanner
        sc.close();
    }
}