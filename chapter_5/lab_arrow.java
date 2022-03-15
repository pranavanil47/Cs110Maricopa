package chapter_5;
import java.util.Scanner;
public class lab_arrow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int arrowBaseHeight;
        int arrowBaseWidth;
        int arrowHeadWidth;
        
        System.out.println("Enter arrow base height:");
        arrowBaseHeight = scnr.nextInt();
        
        System.out.println("Enter arrow base width:");
        arrowBaseWidth = scnr.nextInt();
        
        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt();
        System.out.println("");
        
        // Draw arrow base (height = 3, width = 2)
        int currHeight = 0;
        while(currHeight<arrowBaseHeight) {
            int i = 0;
            while(i<arrowBaseWidth) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            currHeight++;

        }
        
        int currHeadWidth = arrowHeadWidth;
        while (currHeadWidth >0) {
            int k = currHeadWidth;
            while(k>0) {
                System.out.print("*");
                k--;

            }
            System.out.println("");
            currHeadWidth --;
        }
    }
}
