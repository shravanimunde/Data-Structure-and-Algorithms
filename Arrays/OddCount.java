import java.util.*;
class CountEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array");
        int size = sc.nextInt();
        //creating array
        int arr[]=new int[size];
        //taking input of array
        for(int i = 0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        //creating variable to count the odd elements
        int odd =0;
        for(int i = 0; i<size;i++){
            if(arr[i]%2 != 0){
                odd++;
            }

        }
    System.out.print(odd);
           
           
    }
}