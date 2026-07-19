import java.util.*;

// Linear Search
// Write a Java program to search for an element in an array.

class LinearSearch {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of array");
        int size = sc.nextInt();

        // Create an array of the given size
        int arr[] = new int[size];

        // Assume that the element is not found initially
        boolean found = false;

        // Take input for all array elements
        for (int i = 0; i < size; i++) {

            // Store each element in the array
            arr[i] = sc.nextInt();
        }

        // Ask the user which element they want to search
        System.out.print("Enter which element to find");
        int n = sc.nextInt();

        // Traverse the array one element at a time
        for (int i = 0; i < size; i++) {

            // Check if the current element matches the search element
            if (arr[i] == n) {

                // Print the index where the element is found
                System.out.print("The number is present on the index: " + i);

                // Change found to true because the element is found
                found = true;

                // Stop checking the remaining elements
                break;
            }
        }

        // If the element was never found, print this message
        if (!found) {
            System.out.print("Element not found");
        }
    }
}