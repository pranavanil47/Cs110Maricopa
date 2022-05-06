package lap10;

public class OfferedCourse extends Course {
    private String instructorName;
    private String term;
    private String classTime;

    public void setInstructorName(String userInput){
        instructorName = userInput;
    }
    public void setTerm(String userTerm){
        term = userTerm;
    }
    public void setClassTime(String userTime){
        classTime = userTime;
    }

    public String getTerm(){
        return term;
    }
    public String getClassTime(){
        return classTime;
    }
    public String getInstructorName(){
        return instructorName;
    }


    
}
