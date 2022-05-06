package chapter_8;

public class Team {
    // TODO: Declare private fields - name, wins, losses
    private String name;
    private int wins;
    private int losses;
    private float WinPercent= 0.00f;


    
    // TODO: Define mutator methods -
    public void  setName(String userName){
        name = userName; 
    }
    public void setWins(int userWins){
        wins = userWins;
    }

    public void setLosses(int userLosses){
        losses = userLosses;
    }
    //       setName(), setWins(), setLosses()
    
    
    // TODO: Define accessor methods - 
    //       getName(), getWins(), getLosses()
    public String getName(){
        return name;
    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
    
    
    public float getWinPercentage(){
        WinPercent = (float) (wins) /(float)( losses+ wins);
        return WinPercent;
    
    }
    
    
    public void printStanding(){
        System.out.print("Win percentage: " );
        System.out.printf("%.2f",getWinPercentage());
        System.out.println("");
        if(WinPercent>=0.5) {
            System.out.println("Congratulations, "+ name +" has a winning average!");
        }
        else {
            System.out.println("Team "+ name+ " has a losing average.");
        }
    }
    
 }