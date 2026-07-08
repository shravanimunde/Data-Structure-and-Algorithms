/**
 * CountDigits
 * Reads an integer from standard input and prints the number of digits it contains.
 * - Handles negative numbers by using the absolute value.
 * - Special-cases 0 (which has 1 digit).
 *
 * Time complexity: O(d) where d is the number of digits in the input.
 */
import java.util.*;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        // Read the original number (may be negative)
        int n = sc.nextInt();

        // Work with absolute value so negative numbers count correctly
        int number = Math.abs(n);

        // Special-case: 0 has one digit
        if (number == 0) {
            System.out.println(1);
            sc.close();
            return;
        }

        int counter = 0;

        // Each loop iteration removes one digit from 'number'
        while (number > 0) {
            counter++;
            number = number / 10; // integer division drops the last digit
        }

        // Print the total digit count
        System.out.println(counter);
        sc.close();
    }
}