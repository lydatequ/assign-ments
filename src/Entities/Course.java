package Entities;

public class Course {
    private String title;
    private String stream;
    private String type;
    private String startdate;
    private String enddate;
    
    public Course(){
        
    }
    
    public Course(String title, String stream, String type, String startdate, String enddate){
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startdate = startdate;
        this.enddate = enddate; 
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setStream(String stream){
        this.stream = stream;
    }
    
    public String getStream(){
        return stream;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public void setStartDate(String startdate){
        this.startdate = startdate;
    }
    
    public String getStartDate(){
        return startdate;
    }
    
    public void setEndDate(String enddate){
        this.enddate = enddate;
    }
    
    public String getEndDate(){
        return enddate;
    }

    @Override
    public String toString() {
        return "Course{" + "title=" + title 
                         + ", stream=" + stream 
                         + ", type=" + type 
                        + ", startdate=" + startdate 
                        + ", enddate=" + enddate + '}';
    }
    
    
    
    
}
