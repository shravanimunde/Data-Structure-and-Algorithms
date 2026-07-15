//cout even digit 
class CountEvenDigit{
    public static void main(String[] args){
        int number = 123456;
        int lastdigit = 0;
        int evennumber = 0;
        while(number>0){
        lastdigit = number % 10;
        if(lastdigit % 2 == 0){
            evennumber++;
        } 
        number = number / 10;
        }
    System.out.println("The even numbers are : " + evennumber);
    }
    
}