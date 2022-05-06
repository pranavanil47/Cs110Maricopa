package lap10;
public class Encyclopedia extends Book {
    private String edition;
    private int numVolumes;
    
    // TODO: Define mutator methods - 
    //       setEdition(), setNumVolumes()
    public void setEdition(String userInput){
        edition = userInput;

    }
    public void setNumVolumes(int number){
        numVolumes = number;
    }

    
   
    // TODO: Define accessor methods -
    //       getEdition(), getNumVolumes()
    public int getNumVolumes(){
        return numVolumes;
    }
    public String getEdition(){
        return edition;
    }
    
    @Override

    // TODO: Define a printInfo() method that overrides 
    //       the printInfo in Book class 
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: "+ edition);
        System.out.println("   Number of Volumes: "+ numVolumes);
     }
}