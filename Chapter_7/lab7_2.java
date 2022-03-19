package Chapter_7;
import java.util.Scanner;
import java.util.Random;
public class lab7_2 {
    public static String coinFlip(Random rand) {
        int number = rand.nextInt(2);
        String face;
        if (number % 2 == 1) {
            face ="Heads";

        }
        else {
            face = "Tails";
        }
        return face;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        int i;
        int userLimit = scnr.nextInt();

        for (i=0; i<userLimit;i++) {
            System.out.println(coinFlip(rand));
        }
    }
    
}
