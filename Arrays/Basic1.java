// Create an Array
// Take Input in an Array
// Print an Array
import java.util.*;
class Basic1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        //creating the array
        int arr[]=new int[size];
        //taking input of array
        for(int i = 0; i< size; i++){
            arr[i]=sc.nextInt();
        }
        //priting the out put of array
        for(int i = 0 ; i<size;i++){
            //here we use print because we r gonna print on same line 
            // " " and this will add space between two numbers
            System.out.print(arr[i] + " ");
        }
        

    }
}