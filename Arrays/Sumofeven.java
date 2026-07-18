import java.util.*;
class Sumofeven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        //creating array
        int arr[] = new int[size];
        //Taking input 
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i<size ;i++){
            if(arr[i]%2==0){
                // Add the even element to the sum
                sum = sum +arr[i];

            }
        }
    System.out.print(sum);
    }
}