import java.util.*;
class Sumofarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        //creating array
        int arr[] = new int[size];
        //Taking input of array
        for(int i = 0 ; i< size ; i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i<size ; i++){
            //The element present at index i." eg arr[0]-> 10 
            sum = sum + arr[i];

        }
        System.out.print(sum);
        
        
        }
}