// Program to find the sum of all digits of a number

import java.util.*;

class Sumofdigits {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.println("Enter the number");

        // Read the number from the user
        int number = sc.nextInt();

        // Stores the last digit in each iteration
        int lastDigit = 0;

        // Stores the final sum of digits
        int sum = 0;

        // Keep running until all digits are removed
        while (number > 0) {

            // Get the last digit
            // Example:
            // 248931 % 10 = 1
            lastDigit = number % 10;

            // Add the last digit to the running sum
            // Example:
            // sum = 0 + 1 = 1
            // sum = 1 + 3 = 4
            sum = sum + lastDigit;

            // Remove the last digit
            // Example:
            // 248931 / 10 = 24893
            number = number / 10;
        }

        // Print the final sum
        System.out.println(sum);
    }
}