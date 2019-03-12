package EntitiesPer;

import Entities.Assignment;
import Entities.Student;
import java.util.ArrayList;

/**
 *
 * @author Lyda
 */
public class AssignmentsPerStudent {
    private Student student;
    private ArrayList <Assignment> assignments;
    private int studentsMark;
    
    public AssignmentsPerStudent(Student student, ArrayList <Assignment> assignments){
        this.student = student;
        this.assignments = assignments;
    }

    public ArrayList <Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList <Assignment> assignments) {
        this.assignments = assignments;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getStudentsMark() {
        return studentsMark;
    }

    public void setStudentsMark(int studentsMark) {
        this.studentsMark = studentsMark;
    }

    @Override
    public String toString() {
        return "AssignmentsPerStudent{" + "student="        + student 
                                        + ", assignments="  + assignments 
                                        + ", studentsMark=" + studentsMark + '}';
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
