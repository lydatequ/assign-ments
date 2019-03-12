package DataEntry;

import Entities.Course;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lyda
 */
public class CourseDetails {
    
    public Course getDetails(Scanner sc) {
        Course course1 = new Course();
        System.out.println("Please give me the title of the Course: ");
        course1.setTitle(sc.next()); 
        System.out.println("Please enter the stream of the Course (Java or C#): ");
        course1.setStream(sc.next());
        System.out.println("Please enter the type of the Course (Full or Part): ");
        course1.setType(sc.next());
        System.out.println("Please enter the start and end date of the Course: ");
        course1.setStartDate(sc.next());
        course1.setEndDate(sc.next());
        
        return(course1);
    }
    
    public ArrayList <Course> getMultipleCourses(Scanner sc){
        Course course1 = new Course();
        ArrayList <Course> courses = new ArrayList <Course>();
        boolean evaluateUsersInput;

        do {
            course1 = getDetails(sc);
            courses.add(course1);
            System.out.println(course1);
            evaluateUsersInput = sc.next().equals("quit");
        } while (!evaluateUsersInput);
        
        return (courses);
    }
    
    
    
    
    
    
    
    
}
