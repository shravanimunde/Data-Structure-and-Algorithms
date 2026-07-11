// Write a Java program to find the product of all digits of a given number.
import java.util.*;
class Productofdigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number");   
        int number1=sc.nextInt();
        int sum = 1;
        int lastnumber = 0;
        while(number1>0){
            lastnumber = number1 % 10;
            sum = sum * lastnumber;
            number1 = number1 / 10;

        }
    System.out.println(sum);

        }
}