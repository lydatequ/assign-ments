package EntitiesPer;

import Entities.Course;
import Entities.Student;
import java.util.ArrayList;

/**
 *
 * @author Lyda
 */

public class StudentsPerCourse {
    private Course course;
    private ArrayList <Student> students;
    
    public StudentsPerCourse(){
        
    }

    public StudentsPerCourse(Course course, ArrayList<Student> students){
        this.course = course;
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList <Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList <Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "course=" + course + ", students=" + students + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
