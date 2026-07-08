//Write a java program to count the number of digits in a given integer
import java.util.*;
class CountDigits{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
         int number = sc.nextInt();
         int counter =0;
         while(number>0){
            counter++;
            number = number/10;
         }
        System.out.println(number);
    }
}