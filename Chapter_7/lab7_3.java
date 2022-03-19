package Chapter_7;
import java.util.Scanner;
public class lab7_3 {
    public static void sortArray(int[] myArr, int arrSize) {
        int i;
        
        for(i= 0; i<arrSize-1; i++) {
            int j;
            for(j = 0; j <( arrSize - i -1);j++) {
                if (myArr[j] < myArr[j+1]){
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j+ 1] = temp;
               

                }
                
            }
        }
        

        for (i=0; i<arrSize; i++){
            System.out.print(myArr[i]+",");
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i;
        int[] userArray = new int[20];

        int userThress = scnr.nextInt();

        for(i = 0; i< userThress; i++) {
            int temp = scnr.nextInt();
            userArray[i] = temp;
        }

        sortArray(userArray, userThress);
    }
}
