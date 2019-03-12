package DataEntry;

import java.util.Scanner;
import Entities.*;
import java.util.ArrayList;

public class StudentDetails {
    
    public Student getDetails(Scanner sc) {
        Student student1 = new Student();
        System.out.println("Please give me your First Name and Last Name: ");
        student1.setFirstName(sc.next()); 
        student1.setLastName(sc.next());
        System.out.println("Date of Birth: ");
        student1.setDateOfBirth(sc.next());
        System.out.println("Tuition Fees: ");
        student1.setTuitionFees(sc.nextDouble());
        
        return(student1);
    }
    
    public ArrayList <Student> getMultipleStudents(Scanner sc){
        Student student1 = new Student();
        ArrayList<Student> students = new ArrayList<Student>();
        boolean evaluateUsersInput;

        do {
            student1 = getDetails(sc);
            students.add(student1);
            System.out.println(student1);
            evaluateUsersInput = sc.next().equals("quit");
        } while (!evaluateUsersInput);
        
        return(students);
    }
}

