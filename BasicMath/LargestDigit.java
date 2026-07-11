// Program to find the largest digit in a number

import java.util.*;

class LargestDigit {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        // Read the number
        int number = sc.nextInt();

        // Assume the largest digit is the smallest possible digit (0)
        int largest = 0;

        // Keep checking each digit
        while (number > 0) {

            // Get the last digit
            // Example: 284931 % 10 = 1
            int lastDigit = number % 10;

            // If the current digit is greater than the largest found so far,
            // update the largest value
            if (lastDigit > largest) {
                largest = lastDigit;
            }

            // Remove the last digit
            // Example: 284931 / 10 = 28493
            number = number / 10;
        }

        // Print the largest digit
        System.out.println("Largest digit is: " + largest);
    }
}