package chapter_6;
import java.util.Scanner;

public class lab_6_2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int arrayLength;
        int i;
        int j = 0;
        arrayLength = scnr.nextInt();
        int[] frequency = new int[arrayLength];
        String[] userStrings = new String[arrayLength];
        for(i= 0; i < arrayLength; i++) {
            userStrings[i] = scnr.next();
        }

        for(i =0; i <arrayLength; i++ ){
            int count = 0; 
            for(j = 0; j < arrayLength; j++) {
                if (userStrings[i].equals(userStrings[j])) {
                    count++;
                }               
            }
            frequency[i] = count;
            
        }

        for (i = 0; i< arrayLength; i++){
            System.out.println(userStrings[i] + " - "+ frequency[i]);
        }

        
    }
    
}
