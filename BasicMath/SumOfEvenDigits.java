// sum of all even digits 
class SumOfEvenDigits{
    public static void main(String[] args){
        int number = 1246897;
        int lastnumber = 0;
        int evennumber = 0;
        int sumofeven = 0;
    while(number>0){
        lastnumber = number % 10;
        if(lastnumber % 2 == 0){
            sumofeven = sumofeven + lastnumber;

        }
        number = number / 10;

    }
    System.out.println("The sum of even numbers is : " + sumofeven);

    }

}