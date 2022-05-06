package lap10;

public class Course{
    // TODO: Declare private fields - courseNumber, courseTitle
    private String courseNumber;
    private String courseTitle;

 
    // TODO: Define mutator methods - 
    //       setCourseNumber(), setCourseTitle()
    public void setCourseTitle(String userInput){
        courseTitle = userInput;
    }
    public void setCourseNumber(String userNumber){
        courseNumber = userNumber;
    }
 
 
   
    public String getCourseTitle(){
        return courseTitle;
    }
    public String getCourseNumber(){
        return courseNumber;
    }
 
    // TODO: Define printInfo()
    public void printInfo(){
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + courseNumber);
        System.out.println("  Course Title: "+ courseTitle );

    }
  
}
 