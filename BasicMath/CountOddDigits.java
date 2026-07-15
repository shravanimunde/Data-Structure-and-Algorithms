//countb the odd digits 
class CountOddDigits{
    public static void main(String[] args){
        int number = 45578772;
        int lastnumber = 0;
        int oddnumber = 0;

        while(number > 0){
            lastnumber = number % 10;
            if(lastnumber % 2 != 0){
                oddnumber++;

            }
        //removing the last digit
        number = number / 10;
        }
    System.out.println("The Odd number : " + oddnumber);
    }
}