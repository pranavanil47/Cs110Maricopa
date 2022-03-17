package chapter_6;
import java.util.Scanner; 
public class lab_6_1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];
        int i;
        int thresholdValue;     
  
        int numOfInputs= scnr.nextInt();
        
        for (i= 0; i<numOfInputs; i++){
            int temp = scnr.nextInt();
            userValues[i] = temp;
        }

        thresholdValue = scnr.nextInt();

        for (i = 0; i < numOfInputs; i++){
            if(userValues[i]<thresholdValue){
                System.out.print(userValues[i]+ ",");
            }
        }
     }
    
}
