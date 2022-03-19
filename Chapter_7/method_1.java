package Chapter_7;

public class method_1 {
    public static double pyramidVolume (double length, double width, double height ) {
    
        double baseArea;
        double volume;

        baseArea = length * width;
        volume = (baseArea *height) /3);

        return volume;
    }

    public static void printPopcornTime(int bagOunces) {
        if (bagOunces>=2 && bagOunces<=10 ) {
            System.out.println((6 *bagOunces) + " seconds"); 
            
        }
        else if (bagOunces>10) {
            System.out.println("Too large");

        }
        else{
            System.out.println("Too small");
        }
    }

    public static double kelvinToCelsius (double kelvin) {
        double celsius;
        celsius = kelvin - 273.15;
    

        return celsius;
    }
    
    public static int[] swapArrayEnds (int[] array) {
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        return array;

    }
    public static double  mphAndMinutesToMiles (double milesPerHour, double minsTraveled) {
        double hoursTraveled;
        double milesTraveled;
        hoursTraveled = minsTraveled / 60.0;
        milesTraveled = hoursTraveled * milesPerHour; 

        return milesTraveled;

    }
    public static void printSalutation(String personName, String customSalutation) {
        System.out.println(customSalutation+ ", "+ personName);
    }
    public static double convertToInches(double numFeet, double numInches) {
        return convertToInches(numFeet) +  numInches;
    }

}
