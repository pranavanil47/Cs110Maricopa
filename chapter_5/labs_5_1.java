package chapter_5;
import java.util.Scanner;
public class labs_5_1 {
    public static void main(String[]  args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        String userString;
        int stringLength;
        char userChar;
        int charNum = 0;

        userInput = scnr.next();
        userString = scnr.nextLine();
        stringLength = userString.length();
        userChar = userInput.charAt(0);
        
        for (int i = 0; i<stringLength; i++){
            if (userString.charAt(i) == userChar) {
                charNum++;

            }
        }
        System.out.print(charNum);
        if (charNum == 1){
            System.out.println(" "+ userInput);
        }
        else{
            System.out.println(" "+ userInput +  "'s");
        }
        



    }
}
