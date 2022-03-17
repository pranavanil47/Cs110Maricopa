package chapter_6;
import java.util.Scanner;

public class lab_6_3 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int arrayLength;
        String userChar;
        
        int i;
        int j = 0;
        arrayLength = scnr.nextInt();
        String[] userStrings = new String[arrayLength];
        for(i= 0; i < arrayLength; i++) {
            userStrings[i] = scnr.next();
        }
        userChar= scnr.next();
        
        for( i= 0; i < arrayLength; i++) {
            if(userStrings[i].contains(userChar)) {
                System.out.print(userStrings[i]+",");
            }

            
        }
        


     }

    
}
