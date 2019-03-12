package EntitiesPer;

import Entities.Assignment;
import Entities.Course;
import java.util.ArrayList;

/**
 *
 * @author Lyda
 */
public class AssignmentsPerCourse {
    private Course course;
    private ArrayList <Assignment> assignments;
    
    public AssignmentsPerCourse(Course course, ArrayList <Assignment> assignments){
        this.course = course;
        this.assignments = assignments;
    }

    public ArrayList <Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList <Assignment> assignments) {
        this.assignments = assignments;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + "course=" + course + ", assignments=" + assignments + '}';
    }
    
    
    
}

    
    