//Write a Java program to check whether a number is an Armstrong Number.
class Amstrong{
    public static void main(String[] args){
        int number = 145;
        int original = 145;
        int lastnumber = 0;
        int amstrong = 0;
        int sum = 0;
        while(number > 0){
            lastnumber = number % 10;
            int cube = lastnumber*lastnumber*lastnumber;
            number = number/10;
            sum = sum + cube;
            
        }
        if (sum== original){
                System.out.println("IT IS A AMSTRONG NUMBER");
            }else{
                System.out.println("NOT A AMSTRONG NUMBER");
            }
    
    } 
}      