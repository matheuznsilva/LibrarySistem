package users;

public class Student extends Title {
    private Integer level;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    

    public String academicTitle(Integer level){
        String academicTitle;
        if(level == 1){
            academicTitle = "Graduation";
        } else if (level == 2){
            academicTitle = "Master";
        } else {
            academicTitle = "PHD";
        }
        return academicTitle;
    }
    
    public String toString() {
        return "USER: "+ getName() + " - EMAIL: " + getEmail() + " - TITLE: " + academicTitle(level) + "- REGISTRY: " + getRegistry();
    }
    
}
