// Program to check whether a number is Palindrome or Not

import java.util.*;

class Palindrome {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        // Read the number entered by the user
        int number = sc.nextInt();

        // Save the original number because 'number' will become 0 after the loop
        int original = number;

        // This variable will store the reversed number
        int reverse = 0;

        // This variable stores the last digit of the number in each iteration
        int lastDigit = 0;

        // Repeat until all digits are processed
        while (number > 0) {

            // Get the last digit
            // Example:
            // 1234 % 10 = 4
            lastDigit = number % 10;

            // Build the reversed number
            // Example:
            // reverse = 12
            // lastDigit = 3
            // reverse = 12 * 10 + 3 = 123
            reverse = reverse * 10 + lastDigit;

            // Remove the last digit
            // Example:
            // 1234 / 10 = 123
            number = number / 10;
        }

        // Compare the original number with the reversed number
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}