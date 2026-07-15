// Program to count the number of digits in a number

import java.util.*;

class CountDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        // Read the number from the user
        int number = sc.nextInt();

        // Variable to count the digits
        int count = 0;

        // Repeat until the number becomes 0
        while (number > 0) {

            // Remove the last digit
            // Example:
            // 12345 -> 1234
            number = number / 10;

            // Increase the digit count by 1
            count++;
        }

        // Print the total number of digits
        System.out.println("Number of digits: " + count);
    }
}