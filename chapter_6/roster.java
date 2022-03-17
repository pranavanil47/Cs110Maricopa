package chapter_6;
import java.util.Scanner;
public class roster {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        String userCommand;
        int[] jerseyArray = new int[5];
        int[] ratingArray =new int[5];

        for (i=0; i<5; i++){
            System.out.println("Enter player "+(i+1) +"'s jersey number:");
            jerseyArray[i] = scnr.nextInt();
            System.out.println("Enter player "+(i+1) +"'s rating:");
            ratingArray[i] = scnr.nextInt();
            System.out.println("");

        }
        
        System.out.println("ROSTER");
        for( i=0;i<5;i++) {
            System.out.println("Player " + (i+1) + " -- Jersey number: " +jerseyArray[i]+ ", Rating: " + ratingArray[i]);
        }
        System.out.println("");
        System.out.println("MENU");
        
        System.out.println("u - Update player rating");
        System.out.println("a - Output players above a rating");
        System.out.println("r - Replace player");
        System.out.println("o - Output roster");
        System.out.println("q - Quit");
        System.out.println("");
        System.out.print("Choose an option:");
        System.out.println("");

        userCommand = scnr.next();
        while (!userCommand.equals("q")){
            if ( userCommand.equals("u")) {
                System.out.println("Enter a jersey number:");
                int jersey = scnr.nextInt();
                System.out.println("Enter a new rating for player:");
                int rating = scnr.nextInt();

                for (i=0; i<5; i++){
                    if(jerseyArray[i]== jersey){
                        ratingArray[i] = rating;
                    }
                }
            }
            if ( userCommand.equals("o")){
                for( i=0;i<5;i++) {
                    System.out.println("Player " + (i+1) + " -- Jersey number: " +jerseyArray[i]+ ", Rating: " + ratingArray[i]);
                }
            }
            if ( userCommand.equals("a")) {
                System.out.println("Enter a rating:");
                int minRating = scnr.nextInt();
                System.out.println("");
                System.out.println("ABOVE 5");
                for (i=0; i<5; i++ ) {
                    if (ratingArray[i]>minRating){
                        System.out.println("Player 1 -- Jersey number: "+  jerseyArray[i]+ ", Rating: "+ ratingArray[i]);
                    }
                }
            }
            if ( userCommand.equals("r")) {
                System.out.println("Enter a jersey number:");
                int jersey = scnr.nextInt();
                System.out.println("Enter a new jersey number:");
                int newJersey = scnr.nextInt();
                System.out.println("Enter a rating for the new player:");
                int newRating = scnr.nextInt();

                for ( i=0; i<5; i++) {
                    if (jerseyArray[i] == jersey) {
                        jerseyArray[i] = newJersey;
                        ratingArray[i] = newRating;
                    }
                }
                
            }
            
            System.out.print("Choose an option:");
            userCommand = scnr.next();            
        }


  
        
     }
    
}
