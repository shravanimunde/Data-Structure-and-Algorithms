// Program to print Fibonacci Series

import java.util.*;

class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter how many terms you want
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // First two Fibonacci numbers
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;

        // Print the first number if n >= 1
        if (n >= 1) {
            System.out.print(firstNumber + " ");
        }

        // Print the second number if n >= 2
        if (n >= 2) {
            System.out.print(secondNumber + " ");
        }

        // Start from the 3rd term
        for (int i = 3; i <= n; i++) {

            // Find the next Fibonacci number
            nextNumber = firstNumber + secondNumber;

            // Print it
            System.out.print(nextNumber + " ");

            // Move the numbers forward
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}