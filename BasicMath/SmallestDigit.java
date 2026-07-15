// Program to find the smallest digit in a number

import java.util.*;

class SmallestDigit {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        // Read the number from the user
        int number = sc.nextInt();

        // Assume the smallest digit is the largest possible digit (9)
        int smallest = 9;

        // Variable to store the last digit
        int lastDigit = 0;

        // Repeat until all digits are processed
        while (number > 0) {

            // Get the last digit
            // Example:
            // 284931 % 10 = 1
            lastDigit = number % 10;

            // If the current digit is smaller than the smallest found so far,
            // update the smallest value
            if (lastDigit < smallest) {
                smallest = lastDigit;
            }

            // Remove the last digit
            // Example:
            // 284931 / 10 = 28493
            number = number / 10;
        }

        // Print the smallest digit
        System.out.println("Smallest digit is: " + smallest);
    }
}