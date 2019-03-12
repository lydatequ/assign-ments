package DataEntry;

import Entities.Assignment;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lyda
 */
public class AssignmentDetails {
    
    public Assignment getDetails(Scanner sc) {
        Assignment assignment1 = new Assignment();
        System.out.println("Please give me the title of the Assignment: ");
        assignment1.setTitle(sc.next());
        System.out.println("Please enter a description of the Assignment");
        assignment1.setDescription(sc.next());
        System.out.println("Please write the submission date & time: ");
        assignment1.setSubDateAndTime(sc.next());
        System.out.println("Please enter the oral and total mark of the assignment: ");
        assignment1.setOralMark(sc.nextInt());
        assignment1.setTotalMark(sc.nextInt());
        
        return(assignment1);
    }
    
    public ArrayList <Assignment> getMultipleAssignments(Scanner sc){
        Assignment assignment1 = new Assignment();
        ArrayList <Assignment> assignments = new ArrayList <Assignment>();
        boolean evaluateUsersInput;

        do {
            assignment1 = getDetails(sc);
            assignments.add(assignment1);
            System.out.println(assignment1);
            evaluateUsersInput = sc.next().equals("quit");
        } while (!evaluateUsersInput);
        
        return (assignments);
    }
    
    
}
