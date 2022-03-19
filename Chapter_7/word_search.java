package Chapter_7;
import java.util.Scanner;

public class word_search {
    public static void printText(String[] stringArr) {
        for(int i=0; i<stringArr.length-1; i++) {
            System.out.print(stringArr[i]+ " ");
            
        }
        System.out.println(stringArr[stringArr.length-1]);
    }
    public static int getNumOfNonWSCharacters(String[] stringArray){
        int numberOfWS = 0;

        for(int i= 0; i<stringArray.length; i++){
            numberOfWS+= stringArray[i].length();

        }
        return numberOfWS;
    }
    public static int getNumOfWords(String[] stringArray) {
        int numberOfWords = 0;
        for (int i =0; i<stringArray.length; i++) {
            if(stringArray[i]!= "") {
                numberOfWords++;

            }
        }
        return numberOfWords;
        
    }
    public static int findText(String[] stringArr, String userString){
        int i;
        int numberOfInstances = 0;

        for(i =0; i<stringArr.length; i++){
            if (stringArr[i].equals(userString)){
                numberOfInstances++;
            }
        }

        return numberOfInstances;
    }

    public static String[] replaceExclamation(String[] stringArr) {
        int i;
        for(i=0; i<stringArr.length; i++){
            if(stringArr[i].indexOf('!') >0){
                stringArr[i] = stringArr[i].replace("!",".");
            }
        }

        return stringArr;
    }

    public static void shortenSpace(String[] stringArr) {    
        for(int i=0; i<stringArr.length; i++) {
            if(stringArr[i]!=""){
                System.out.print(stringArr[i] + " ");

            }
        }
    }
    public static void printMenu() {
        System.out.println("");
        System.out.println("MENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit");
        System.out.println("");
        System.out.println("Choose an option:");
    } 

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter a sample text:");


        String userInput = scnr.nextLine();
        System.out.println("");
        String[] stringArr = userInput.split(" ");
        System.out.print("You entered: ");
        System.out.println(userInput);

        String userCommand;
        printMenu();

        userCommand = scnr.nextLine();

        
        while (!userCommand.equals("q")) {
            if (userCommand.equals("c")) {
                System.out.print("Number of non-whitespace characters: "+getNumOfNonWSCharacters(stringArr));
            }
            if (userCommand.equals("w")) {
                System.out.print("Number of words: "+ getNumOfWords(stringArr));
            }
            if (userCommand.equals("f")){
                System.out.println("Enter a word or phrase to be found:");
                String word = scnr.next();
                System.out.print("\""+word+"\" instances:" + findText(stringArr, word)); 
            }
            if (userCommand.equals("r")) {
                System.out.print("Edited text: ");
                printText(replaceExclamation(stringArr));
            }
            if(userCommand.equals("s")){
                shortenSpace(stringArr);
            }
            System.out.println("");
            printMenu();
            userCommand = scnr.nextLine();
        }

        
        

        

        

    }
    
}
