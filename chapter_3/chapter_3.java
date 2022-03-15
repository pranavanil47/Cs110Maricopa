
/*to get random number
mport java.util.Random;

public class ThreeRandomValues {
   public static void main(String[] args) {
      Random randGen = new Random();  // New random number generator
*/

import java.util.Scanner;
public class doubleManupulation {
    //tof ormat double
    public static void main(String[] args) {
        double float1 = 3.51;
        double float2 = 2.3;
        double float3; 

        float3 = float1/float2;
        System.out.println("%.2f", float3);
        
    }
}


public class mathProblems {
    public static void main(string[] args) {


    }
}

public class CoordinateGeometry {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       double x1;
       double y1;
       double x2;
       double y2;
       double pointsDistance;
       double xDist;
       double yDist;
 
       pointsDistance = 0.0;
       xDist = 0.0;
       yDist = 0.0;
 
       x1 = scnr.nextDouble();
       y1 = scnr.nextDouble();
       x2 = scnr.nextDouble();
       y2 = scnr.nextDouble();
 
       double temp1 = Math.pow((x2-x1),2.0) + Math.pow((y2-y1),2.0);
       pointsDistance = Math.sqrt(temp1);
 
       System.out.println(pointsDistance);
    }
 }


public class OutputCombinations {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      char a;
      char b;
      char c;

      a = scnr.next().charAt(0);
      b = scnr.next().charAt(0);
      c = scnr.next().charAt(0);

      System.out.print(""+ a + b + c + "");
      System.out.print(""+ a + c + b + "");
      System.out.print(""+ b + a + c + "");
      System.out.print(""+ b + c + a + "");
      System.out.print(""+ c + a + b + "");
      System.out.print(""+ c + b + a + "");

     

      System.out.println("");
   }
}