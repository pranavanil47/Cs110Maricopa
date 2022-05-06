package lab9;
import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt=0;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int month;
      String day , year;

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m/d/yyyy format
      String input = scnr.nextLine();
      while (!input.equals(-1)){
        String[] arr = input.split(" ");
        if(getMonthAsInt(arr[0])!=0 && arr[1].contains(',')==true){
            month = getMonthAsInt(arr[0]);
            day = arr[1].replaceFirst(",", "");
            year = arr[2];
            System.out.println(""+month+"/"+day+"/"+year);
            
        }
        input = scnr.nextLine();
          

      }
   }


     
   
}
