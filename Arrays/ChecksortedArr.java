// Program to check whether an array is sorted in ascending order

class CheckSortedArr {
    public static void main(String[] args) {

        // Step 1: Create an array
        int[] arr = {10, 2, 44, 99, 256};

        // Step 2: Assume the array is sorted.
        // If we find any wrong order, we'll change it to false.
        boolean isSorted = true;

        // Step 3: Traverse the array
        // We stop at arr.length - 1 because we compare i with i + 1.
        for (int i = 0; i < arr.length - 1; i++) {

            // Step 4: Compare the current element with the next element.
            // If the current element is greater than the next,
            // the array is NOT in ascending order.
            if (arr[i] > arr[i + 1]) {
                isSorted = false; // Mark the array as not sorted.
                break;            // No need to check further.
            }
        }

        // Step 5: Print the result.
        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}