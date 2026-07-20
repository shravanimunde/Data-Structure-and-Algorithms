import java.util.*;

class ReverseArray {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        // Create an array of the given size
        int arr[] = new int[size];

        // Take input for all array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Start points to the first element
        int start = 0;

        // End points to the last element
        //// Last index = size - 1 because array indexing starts from 0
        ///means if user input size 4 but the ibdeax start from 0 so 
        ///int end= size-1
        ///int end = 4 -1 = 3
        int end = size - 1;

        // Reverse the array
        while (start < end) {

            // Store the first element in a temporary variable
            int temp = arr[start];

            // Put the last element in the first position
            arr[start] = arr[end];

            // Put the first element in the last position
            arr[end] = temp;

            // Move start one step forward
            start++;

            // Move end one step backward
            end--;
        }

        // Print the reversed array
        System.out.println("Reversed Array:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}//iteration 1.  for example arr[10,20,30,40]
//int start = 0. and int end = size - 1 (if we know the array size we can simple put end = 3 )
//while(start<end)[true][0<3] we go inside the loop
// int temp = arr[start]//storing the value of start i.e o index in temp i.e 10
//arr[start] = arr[end]// storing the arr end value i.e indexni.e 40 in arr[start]
//now the array become 40,20,30,40
// arr[end] = temp assigning the value of temp to arr end 
//now the array becomes 40,20,30,10
//start++ it increments the value of index from 0 to 1 
// end-- it decreases the value of end from 3 to 2  


