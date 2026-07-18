//Find the largest element in array
import java.util.*;
class Largestelement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        //Creating Array
        int arr[] = new int[size];
        //Taking input of array
        for(int i = 0; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        // Assume the first element is the largest
        int largest = arr[0];
        for(int i = 0 ; i<size ; i++){
            // If the current element is greater than the largest,
            // update the largest value
            if(largest< arr[i]){
                largest = arr[i];
            }
        }
    System.out.print(largest);
    }
}