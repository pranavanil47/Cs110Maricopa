package chapter_5;
import java.util.Scanner;
public class lab5_3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        
        userInput = scnr.nextLine();

        while ((!userInput.equals("Done")) && !userInput.equals("done") && !userInput.equals("d")) {
            int stringLength = userInput.length();
            int i = stringLength-1;
            while (i >=0) {
                System.out.print(userInput.charAt(i));
                i--;
                

            }
            System.out.println("");
            userInput = scnr.nextLine();

        } 
        
    }
}
