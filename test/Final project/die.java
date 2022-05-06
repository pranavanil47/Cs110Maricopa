public class die {
    /* 
    This programm contain the maechanics to roll two dices, get the resutls 
    in string form and to check whether both the dies match.
    */           
    private int die1 = 0;
    private int die2 = 0;
    public String dies_value;

    public void roll(){
        /*
        This class rolls the die to assign the values to each die.
        */               
        int val1 = roll_die();
        die1 = val1; 
        int val2 = roll_die();
        die2 = val2;
         


    }
    private int roll_die() {
        /*
        This private class generates a random number between 1 and 6 both included
        and returns it.
        */ 
        int val = (int) (Math.random()*6) +1;
        return val;

    }
    

    public boolean equals(){
        /*
        This class checks if the numbers rolled on both dies match or not. If they
        match returns true else returns false.
        */ 
        if(die1 == die2) {
            return (true);

        }
        else{
            return (false);
        }

    }
    private String integerToString(int number){
        /*
        This private class returns the string of an integer between 1 and 6 both
        included. 
        */ 
        if (number==1){
            return "one";
        }
        else if (number == 2){
            return "two";
        }
        else if (number == 3){
            return "three";
        }
        else if (number == 4){
            return "four";
        }
        else if (number == 5){
            return "five";
        }
        else if (number == 6){
            return "six";
        }
        return ("error");


    }
    public String toString(){
        /*
        This class uses the private class IntegerToString and returns the results
        of the throw in form of a string message
        */ 
        String string1 = integerToString(die1);
        String string2 = integerToString(die2);

        dies_value = ("You rolled a "+ string1 +" and "+string2);
        return dies_value;

        

    }

    

    
}
