package chapter_5;
import java.util.Scanner;
public class lab_5_2 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int intStart;
        int intEnd;

        intStart = scnr.nextInt();
        intEnd = scnr.nextInt();
        int curr = intStart;
        
        if (intEnd >= intStart) {
            while(curr <=intEnd) {
                System.out.print(curr+ " ");
                curr = curr+ 5 ;
            }
            System.out.println("");
        }

        else {
            System.out.println("Second integer can't be less than the first.");
        }
    }
}
