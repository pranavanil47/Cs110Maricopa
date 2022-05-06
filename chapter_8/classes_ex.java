package chapter_8;
import java.util.ArrayList;
import java.util.Scanner;


public class classes_ex {
    public static void printArrayList(ArrayList<Integer> numsList) {
      int i;

      for (i = 0; i < numsList.size(); ++i) {
         System.out.print(numsList.get(i));
         System.out.print(" ");
      }

      System.out.println("");
   }

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<Integer> numsList = new ArrayList<Integer>();
      int userInput;
      int i;

      for (i = 0; i < 3; ++i) {
         userInput = scnr.nextInt();
         numsList.add(userInput);
      }

      
      int lastNum = numsList.get(2);
      int firstNum = numsList.get(0);
      numsList.clear();
      numsList.add(firstNum);
      numsList.add(101);
      numsList.add(102);
      numsList.add(lastNum);
      
      printArrayList(numsList);
   }
  
}
