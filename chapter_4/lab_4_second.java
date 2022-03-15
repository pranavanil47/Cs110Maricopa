package chapter_4;
import java.util.Scanner;
public class lab_4_second {
    public static void main(String[] args) {
       int numDollars = 0;
       int numQuarters = 0;
       int numDimes = 0;
       int numNickels = 0;
       int numPennies = 0;
       int num;
       Scanner scnr = new Scanner(System.in);
       num = scnr.nextInt();
       if (num > 0) {

       
    
        numDollars += num/100;
        num = num % 100;
        numQuarters += num/25;
        num = num % 25;
        numDimes += num/10;
        num = num%10;
        numNickels += num/5;
        num = num % 5;
        numPennies += num/1;

        if (numDollars > 0){
            if (numDollars==1){
                System.out.println(numDollars+ " Dollar");
            }
            else{ 
                System.out.println(numDollars + " Dollars");
            }
        }
        if (numQuarters > 0){
            if (numQuarters==1){
                System.out.println(numQuarters+ " Quarter");
            }
            else{
                System.out.println(numQuarters + " Quarters");
            }
        }
        if (numDimes > 0){
            if (numDimes==1){
                System.out.println(numDimes+ " Dime");
            }
            else{
                System.out.println(numDimes + " Dimes");
            }
        }
        if (numNickels > 0){
            if (numNickels==1){
                System.out.println(numNickels+ " Nickel");
            }
            else{
                System.out.println(numNickels + " Nickels");
            }
        }
        if (numPennies > 0){
            if (numPennies==1){
                System.out.println(numPennies+ " Pennie");
            }
            else{
                System.out.println(numPennies + " Pennies");
            }
        }
        

       }
       else {
           System.out.println("No change");
       }




    }
    
}
