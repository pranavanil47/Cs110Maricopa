package lab_13;
import java.util.Scanner;
public class DescendingOrder {
        public static void selectionSortDescendTrace( int [] numbers, int numElements)
    {
        for (int i = 0; i < numElements - 1; i++) {
            if(numbers[i] > 0) {
            int maxElementIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[maxElementIndex] < numbers[j]) {
                    maxElementIndex = j;
                }
            }
                int temp = numbers[i];
                numbers[i] = numbers[maxElementIndex];
                numbers[maxElementIndex] = temp;
                
                for (int element: numbers) {
                    if(element > 0)
                        System.out.print(element + " ");
                    }
                    System.out.println("");
                }
        }
    }
    
    public static void main(String[] args){  
        Scanner scnr = new Scanner(System.in);
        
        int input, i = 0;
        int numElements = 0;
        int [] numbers = new int[10];
        
        do{
            input = scnr.nextInt();
            if(input != -1){
            numbers[i] = input;
            i++;
            numElements++;
            }
            
            }while(input != -1);
            selectionSortDescendTrace(numbers, numElements);
        
    }  

}
   

    

