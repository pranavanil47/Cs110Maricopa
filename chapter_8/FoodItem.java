package chapter_8;

public class FoodItem {
    private String name;
    private double fat;
    private double carbs;
    private double protein;
    
    public FoodItem(){
        name = "None";
        fat = 0.00;
        carbs = 0.00;
        protein = 0.00;

    }
    public FoodItem(String userName, double userFat, double usercarbs, double userProtein){
        name = userName;
        fat = userFat;
        carbs = usercarbs;
        protein = userProtein;
    }
    
    // TODO: Define second constructor with parameters to initialize private fields (name, fat, carbs, protein)
    
    public String getName() {
       return name;
    }
    
    public double getFat() {
       return fat;
    }
    
    public double getCarbs() {
       return carbs;
    }
    
    public double getProtein() {
       return protein;
    }
    
    public double getCalories(double numServings) {
       // Calorie formula
       double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
       return calories;
    }
    
    public void printInfo() {
       System.out.println("Nutritional information per serving of " + name + ":");
       System.out.printf("   Fat: %.2f g\n", fat);
       System.out.printf("   Carbohydrates: %.2f g\n", carbs);
       System.out.printf("   Protein: %.2f g\n", protein);
    }
}
