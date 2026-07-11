// Write a Java program to find the product of all digits of a given number.
// Program to find the product of all digits

import java.util.*;

class ProductOfDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");

        // Read the number
        int number = sc.nextInt();

        // Product starts from 1 because multiplying by 0 always gives 0
        int product = 1;

        // Stores the last digit
        int lastDigit = 0;

        // Repeat until all digits are processed
        while (number > 0) {

            // Get the last digit
            lastDigit = number % 10;

            // Multiply the digit with the current product
            product = product * lastDigit;

            // Remove the last digit
            number = number / 10;
        }

        // Print the final product
        System.out.println(product);
    }
}
