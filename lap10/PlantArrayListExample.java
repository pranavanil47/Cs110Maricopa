package lap10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
   public static void printArrayList(ArrayList<Plant> array){
       int length = array.size();
       int i = 0;

       while (i<length){
           Plant userPlant = array.get(i);
           userPlant.printInfo();
           System.out.println();
           i++;

 
       }

       
   }                                                      
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      ArrayList<Plant> myGarden = new ArrayList<Plant>();


      
      
      input = scnr.next();
      while(!input.equals("-1")){

            Plant plant = new Plant();
            Flower flower = new Flower();
            String plantName, plantCost, colorOfFlowers;
            boolean isAnnual;
          if(input.equals("plant")){
              plantName = scnr.next();
              plantCost = scnr.next();
              
              plant.setPlantName(plantName);
              plant.setPlantCost(plantCost);

              myGarden.add(plant);
          }
          
          else if(input.equals("flower")){

              plantName = scnr.next();
              plantCost = scnr.next();
              isAnnual = scnr.nextBoolean();
              colorOfFlowers = scnr.next();
              flower.setPlantName(plantName);
              flower.setPlantCost(plantCost);
              flower.setPlantType(isAnnual);
              flower.setColorOfFlowers(colorOfFlowers);

              myGarden.add(flower);



          }
                
            
         input = scnr.next();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
      
   }
}