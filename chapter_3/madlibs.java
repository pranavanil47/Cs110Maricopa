package chapter_3;
import java.util.Scanner;
//This program is example of uses of nextline 
public class madlibs {public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    String wordRelative;
    String wordFood;
    String wordAdjective;
    String wordTimePeriod;

    // Get user's words
    System.out.println("Provide input without spaces.");

    System.out.println("Enter a kind of relative: ");
    wordRelative = scnr.nextLine();

    System.out.println("Enter a kind of food: ");
    wordFood = scnr.nextLine();

    System.out.println("Enter an adjective: ");
    wordAdjective = scnr.nextLine();

    System.out.println("Enter a time period: ");
    wordTimePeriod = scnr.nextLine();

    // Tell the story
    System.out.println();
    System.out.print  ("My " + wordRelative);
    System.out.println(" says eating " + wordFood);
    System.out.println("will make me more " + wordAdjective + ",");
    System.out.println("so now I eat it every " + wordTimePeriod + ".");
 }

    
}
