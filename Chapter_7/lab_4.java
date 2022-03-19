package Chapter_7;
import java.util.Scanner;
public class lab_4 {
    public static int fibonacci(int n) {
        int numb; 
        if (n>0) {
            int i;
            int[] fSequence = new int[n+1];
            fSequence[0] = 0;
            fSequence[1] = 1;
            if (n>2){
                for (i=2; i<n+1; i++){
                    fSequence[i] = fSequence[i-1] + fSequence[i-2];
                    
                }
                numb = fSequence[n];
            }
            
            else{
                numb = fSequence[n-1];
            }
            
        
        }
        else if (n==0){
            numb = 0;
        }
        else{
            numb = -1;
            } 
        
        return numb;
     }
     
     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startNum;
        
        startNum = scnr.nextInt();
        System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
     }
    
}
