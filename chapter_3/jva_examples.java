package chapter_3;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class jva_examples {
    /*
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        int temp1;
        int temp2;
        int temp3;

        num = scnr.nextInt();

        temp1 = num / 2;
        temp2 = temp1 / 2;
        temp3 = temp2 / 2;
        
        System.out.println(temp1 + " " + temp2 + " " + temp3 + " ");

    }
    ?
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int age;
        int weight;
        int heartRate;
        int time_;
        double calories;
        
        double AGE_CONSTANT = 0.2757;
        double WEIGHT_CONSTANT = 0.03295;
        double HEART_CONSTANT = 1.0781;

        age = scnr.nextInt();
        weight = scnr.nextInt(); 
        heartRate = scnr.nextInt(); 
        time_ = scnr.nextInt();  
        

        calories = ((double) (( (age*AGE_CONSTANT ) + (weight * WEIGHT_CONSTANT) + (heartRate *HEART_CONSTANT) - 75.4991 ) * time_) / 8.368 );

        System.out.printf("%.2f", calories);





    }
    

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat();
        formatter = new DecimalFormat("0.#####E0##########");

        double x;
        double y;
        double z;
        
        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();

        double output_1 = Math.pow(x, z);
        
        double output_2 = Math.pow(x, Math.pow(y, z));
        
        double output_3 = Math.abs(y);

        double output_4 = Math.sqrt(Math.pow((x * y), z));

        System.out.print(output_1);
        System.out.print(" ");
        System.out.print(formatter.format(output_2));
        System.out.print(" ");
        System.out.printf("%.1f", output_3);
        System.out.print(" ");
        System.out.println(output_4);


     }
     

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int baseChar; 
        int headChar;

        baseChar = scnr.nextInt();
        headChar = scnr.nextInt();
        String head = Integer.toString(headChar);
        String base = Integer.toString(baseChar);

        



        System.out.println("     "+ head);
        System.out.println( "     " + head + head);
        System.out.println(base + base + base + base + base + head + head + head);
        System.out.println(base + base + base + base + base + head + head + head+ head);
        System.out.println(base + base + base + base + base + head + head + head);
        System.out.println( "     " + head + head);
        System.out.println("     "+ head);




    }
    */
    
       public static void main(String[] args) {
          Scanner scnr = new Scanner(System.in);
          double wallHeight;
          double wallWidth;
          double wallArea;
          char test;

          test = '\'';
          
          System.out.println("Enter wall height (feet):");
          wallHeight = scnr.nextDouble();
          System.out.println("Enter wall width (feet):");         
          wallWidth = scnr.nextDouble();
          
          wallArea = wallHeight * wallWidth;
          System.out.println("Wall area: " + wallArea + " square feet" );

          System.out.println("" + test);

        
          
          


          
         
    
          
       }   







}

