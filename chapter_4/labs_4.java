package chapter_4;
import java.util.Scanner;
public class labs_4 {
    /*
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    int smallest;
    num1 = scnr.nextInt();
    num2 = scnr.nextInt();
    num3 = scnr.nextInt();

    if ((num1<num2) && (num1< num3)){
        smallest = num1;
    }
    else if ((num2<num3) && (num2< num1)) {
        smallest = num2;
    }
    else {
        smallest = num3;
    }

    System.out.println(smallest);


 }
 */

 public static void main(String[] args){
    Scanner scnr = new Scanner(System.in); 
    int highwayNumber;
    int primaryNumber;

    highwayNumber = scnr.nextInt();
    if ((highwayNumber>0) && (highwayNumber<100)){
        if (highwayNumber %2 == 0) {
            System.out.println("I-"+highwayNumber + " is primary, going east/west.");
        
        }
        else {
            System.out.println("I-"+highwayNumber + " is primary, going north/south.");
        }
    }
    else if (highwayNumber > 100 && highwayNumber<999) {
        if (highwayNumber %100 != 0) {
            primaryNumber = highwayNumber % 100;
            
            if (highwayNumber %2 == 0) {
                System.out.println("I-"+highwayNumber + " is auxilory, serving I-" + primaryNumber+" going east/west.");
            
            }
            else {
                System.out.println("I-"+highwayNumber + " is auxilory, serving I-" + primaryNumber+" going north/south.");
            
            }


        }
        else{
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
    }
   

 }
    
}
