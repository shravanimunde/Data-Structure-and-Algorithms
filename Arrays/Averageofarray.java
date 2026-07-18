import java.util.*;
class Averageofarray{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        //Creating the array 
        int arr1[] = new int[size];
        //Taking input of array
        for(int i = 0; i<size; i++){
            arr1[i]=sc.nextInt();
        }
        //calculating the sum 
        int sum = 0;
        for(int i = 0 ; i< size; i++){
            sum = sum + arr1[i]; 
        }
    //calculating the average 
    int avg = 0;
    avg = sum / size;
    System.out.print(avg);

    }
}