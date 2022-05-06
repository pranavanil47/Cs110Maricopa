package final_project;
import java.util.Scanner;
import java.util.InputMismatchException;
public class test23 {
    public static void main(String args[]){
        die play = new die ();                                                   //calling die.java file 
        Scanner scnr = new Scanner(System.in); 
        double THRESHOLD = 0.001;                                                //setting a thresshold to compare doubles. 
        double bank = 100.00;                                                    //constructing a start balance
        double userBet = 0.009;
        

        while (Math.abs(0-bank) >THRESHOLD &&  userBet !=0){                     //makes a loop until the balance is zero or the user inputs zero
            System.out.println("You have $" + String.format("%.2f", bank));
            while(true){                                                         //makes a loop until the user inputs a valid input 
                try{
                    System.out.print("How much would you like to bet (Enter 0 to quit)? ");
                    userBet = scnr.nextDouble();
                    break;                                                       //stops the loop when the input is valid 
                    
                }
                catch (InputMismatchException e){                                // catches if there is an error, if the input isn't a double.
                    System.out.println("Enter a number");
                    scnr.next();
                    continue;                                                    // continues the loop
                                   
                }
                finally{
                    if (userBet >bank && userBet<0){                             // continues the loop if the entered value is greater than what 
                        System.out.println("Enter a valid bet");                    //is in the users bank or if it is negative 
                        scnr.next();
                        continue;
                        }
                    }
                
            }
                                          
            play.roll();
            System.out.println(play.toString());
            boolean result = play.equals();
            if (result){
                System.out.println("You win $"+ String.format("%.2f", userBet));
                bank+= userBet;   
            }
            else{
                System.out.println("You lose $"+ String.format("%.2f", userBet));
                bank-= userBet;  
            }
        
        
            System.out.println();
        }
        
        
        if (bank>0){
            System.out.println("Your end winnings is $"+ String.format("%.2f", bank));
        }
        else{
            System.out.println("I am sorry you lost all your money better luck next time ");
        }

    }
    
}

    

