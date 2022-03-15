package chapter_4;
import java.util.Scanner;
public class lab_4_third {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userString;

        userString = scnr.nextLine();
        System.out.println("You entered: "+ userString);

        if (userString.indexOf("BFF")!=-1) {
            System.out.println("BFF: best friend forever");
        }
        if (userString.indexOf("IDK")!=-1) {
            System.out.println("IDK: I don't know");
        }
        if (userString.indexOf("JK")!=-1) {
            System.out.println("JK: just kidding");
        }
        if (userString.indexOf("TMI")!=-1) {
            System.out.println("TMI: too much information");
        }
        if (userString.indexOf("TTYL")!=-1) {
            System.out.println("TTYL: talk to you later");
        }


  
    
     }
}
