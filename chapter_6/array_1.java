package chapter_6;

public class array_1 {
    public static void main(String[] args) {
        int[] numbers = {0,0,0,0,0,0};
        

        int i = 0;
        while (i<5){
            numbers[i] = i;
            i++;

        }
        for(i = 0; i<numbers.length; ++i);{
            System.out.println(numbers[i]);
        }
    }
    
}
