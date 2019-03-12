package myPackage;

import DataEntry.*;
import EntitiesPer.*;
import Entities.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrivateSchoolMainClass {

    public static void main(String[] args) {
        int usersInput;

        //Scanner class to initiate user's input
        Scanner sc = new Scanner(System.in);

        //Populate a list of Students with dummy data
        Student s1 = new Student(" ", " ", getDateToString("12/3/1988"), 2500);
        s1.setFirstName("Mihalis");
        s1.setLastName("Nikolaidis");
        Student s2 = new Student(" ", " ", getDateToString("07/7/1983"), 2500);
        s2.setFirstName("Giannis");
        s2.setLastName("Minas");
        Student s3 = new Student(" ", " ", getDateToString("22/5/1985"), 2500);
        s3.setFirstName("Vaso");
        s3.setLastName("Gennimata");
        Student s4 = new Student(" ", " ", getDateToString("12/12/1989"), 2500);
        s4.setFirstName("Giannis");
        s4.setLastName("Depastas");
        Student s5 = new Student(" ", " ", getDateToString("09/07/1987"), 2500);
        s5.setFirstName("Lyda");
        s5.setLastName("Michopoulou");
        Student s6 = new Student(" ", " ", getDateToString("09/05/1984"), 2500);
        s6.setFirstName("Lilian");
        s6.setLastName("Papa");

        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);

        //Populate a list of trainers with dummy data
        Trainer t1 = new Trainer(" ", " ", "Intro to Java"+ "\n");
        t1.setFirstName("Steve");
        t1.setLastName("Wozniak");
        Trainer t2 = new Trainer(" ", " ", "Intro to C#"+ "\n");
        t2.setFirstName("Steve");
        t2.setLastName("Jobs");
        Trainer t3 = new Trainer(" ", " ", "Java Foundation"+ "\n");
        t3.setFirstName("Bill");
        t3.setLastName("Gates");
        Trainer t4 = new Trainer(" ", " ", "Design Patterns"+ "\n");
        t4.setFirstName("Seth");
        t4.setLastName("Godin");

        ArrayList<Trainer> listOfTrainers = new ArrayList<Trainer>();
        listOfTrainers.add(t1);
        listOfTrainers.add(t2);
        listOfTrainers.add(t3);
        listOfTrainers.add(t4);

        //Populate a list of courses
        Course c1 = new Course(" CB7", " Java", " Full", getDateToString(" 21/01/2019"), getDateToString("21/04/2019") + "\n");
        Course c2 = new Course(" CB7", " CSharp", " Full", getDateToString(" 21/01/2019"), getDateToString("21/04/2019") + "\n");

        ArrayList<Course> listOfCourses = new ArrayList<>();
        listOfCourses.add(c1);
        listOfCourses.add(c2);

        //Populate a list of Assignments
        Assignment a1 = new Assignment("Title", "Description", getDateToString("27/03/2019"), 20, 80, 0);
        a1.setTitle("Java Program");
        a1.setDescription("Learn how to create your own programs in java");
        Assignment a2 = new Assignment("Title", " Description", getDateToString("27/3/2019"), 20, 80, 0);
        a2.setTitle("C# Program");
        a2.setDescription("Create a C# program with classes");

        ArrayList<Assignment> listOfAssignments = new ArrayList<>();
        listOfAssignments.add(a1);
        listOfAssignments.add(a2);
        
        //Populate a list of StudentsPerCourse
        StudentsPerCourse spc1 = 
                new StudentsPerCourse();
        spc1.setStudents(listOfStudents);
        spc1.setCourse(c1);
        
        ArrayList <StudentsPerCourse> listOfCoursesWithTheirStudents = new ArrayList <StudentsPerCourse>();
        listOfCoursesWithTheirStudents.add(spc1);
        
        //Populate a list of TrainersPerCourse
        TrainersPerCourse tpc1 = new TrainersPerCourse (c1, listOfTrainers);
        tpc1.setTrainers(listOfTrainers);
        tpc1.setCourse(c1);
        
        ArrayList <TrainersPerCourse> listOfCoursesWithTheirTrainers = new ArrayList <TrainersPerCourse>();
        listOfCoursesWithTheirTrainers.add(tpc1);
        
        //Populate a list of AssignmentsPerCourse
        AssignmentsPerCourse apc1 = new AssignmentsPerCourse (c1, listOfAssignments);
        apc1.setAssignments(listOfAssignments);
        apc1.setCourse(c1);
        
        ArrayList <AssignmentsPerCourse> listOfCoursesWithTheirAssignments = new ArrayList <AssignmentsPerCourse>();
        listOfCoursesWithTheirAssignments.add(apc1);
        
        //Populate a list of AssignmentsPerStudent
        AssignmentsPerStudent aps1 = new AssignmentsPerStudent (s1, listOfAssignments);
        aps1.setAssignments(listOfAssignments);
        aps1.setStudentsMark(78);
        aps1.setStudent(s1);
        AssignmentsPerStudent aps2 = new AssignmentsPerStudent (s2, listOfAssignments);
        aps2.setAssignments(listOfAssignments);
        aps2.setStudentsMark(85);
        aps2.setStudent(s2);
        AssignmentsPerStudent aps3 = new AssignmentsPerStudent (s3, listOfAssignments);
        aps3.setAssignments(listOfAssignments);
        aps3.setStudentsMark(65);
        aps3.setStudent(s3);
        AssignmentsPerStudent aps4 = new AssignmentsPerStudent (s4, listOfAssignments);
        aps4.setAssignments(listOfAssignments);
        aps4.setStudentsMark(55);
        aps4.setStudent(s4);
        AssignmentsPerStudent aps5 = new AssignmentsPerStudent (s5, listOfAssignments);
        aps5.setAssignments(listOfAssignments);
        aps5.setStudentsMark(85);
        aps5.setStudent(s5);
        AssignmentsPerStudent aps6 = new AssignmentsPerStudent (s6, listOfAssignments);
        aps6.setAssignments(listOfAssignments);
        aps6.setStudentsMark(90);
        aps6.setStudent(s6);
        
        ArrayList <AssignmentsPerStudent> listOfStudentsWithTheirAssignments = new ArrayList <AssignmentsPerStudent>();
        listOfStudentsWithTheirAssignments.add(aps1);
        listOfStudentsWithTheirAssignments.add(aps2);
        listOfStudentsWithTheirAssignments.add(aps3);
        listOfStudentsWithTheirAssignments.add(aps4);
        listOfStudentsWithTheirAssignments.add(aps5);
        listOfStudentsWithTheirAssignments.add(aps6);
        
        //New student object
        Student student1 = new Student();
        StudentDetails studentDetails = new StudentDetails();
        //List of Students
        ArrayList<Student> students = new ArrayList<Student>();
        //New trainer object
        Trainer trainer1 = new Trainer();
        TrainerDetails trainerDetails = new TrainerDetails();
        //List of trainers
        ArrayList<Trainer> trainers = new ArrayList<Trainer>();
        //New course object
        Course course1 = new Course();
        CourseDetails courseDetails = new CourseDetails();
        //List of courses
        ArrayList<Course> courses = new ArrayList<Course>();
        //New assignment object
        Assignment assignment1 = new Assignment();
        AssignmentDetails assignmentDetails = new AssignmentDetails();
        //List of assignments
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();

        //Welcome message and instructions on what type
        System.out.println("Welcome to Private Coding School!");
        System.out.println("How do you want to proceed?"
                + " Do you want to enter data or see entity lists?"
                + "For data press -> 1, for entity lists -> press 2");
        usersInput = sc.nextInt();
        if (usersInput == 1) {
            System.out.println("For Student type 1, for Trainer type 2, "
                    + "for Course type 3, "
                    + "for Assignment type 4. If you want to leave, type quit.");
            int x = sc.nextInt();
            //switch to receive usersInput        
            switch (x) {
                case 1:
                    students = studentDetails.getMultipleStudents(sc);
                    break;
                case 2:
                    trainers = trainerDetails.getMultipleTrainers(sc);
                    break;
                case 3:
                    courses = courseDetails.getMultipleCourses(sc);
                    break;
                case 4:
                    assignments = assignmentDetails.getMultipleAssignments(sc);
                    break;
                default:
                    break;
            }

        } else if ( usersInput == 2){
            System.out.println("For list of Students --> press 1,"      + "\n"
                    + " for list of Trainers --> press 2,"              + "\n"
                    + " for list of Courses --> press 3,"               + "\n"
                    + " for list of Assignments --> press 4,"           + "\n"
                    + " for list of StudentsPerCourse --> press 5,"     + "\n"
                    + " for list of TrainersPerCourse --> press 6,"     + "\n"
                    + " for list of AssignmentsPerCourse --> press 7,"  + "\n"
                    + " for list of AssignmentsPerStudent --> press 8"  + "\n");
            int y = sc.nextInt();
            switch (y) {
                case 1: 
                    System.out.println(listOfStudents);
                    break;
                case 2: 
                    System.out.println(listOfTrainers);
                    break;
                case 3:
                    System.out.println(listOfCourses);
                    break;
                case 4:
                    System.out.println(listOfAssignments);
                    break;
                case 5: 
                    for(StudentsPerCourse s :listOfCoursesWithTheirStudents){
                        System.out.println(s);
                    }
                    break;
                case 6:
                    for(TrainersPerCourse t: listOfCoursesWithTheirTrainers){
                        System.out.println(t);
                    }
                    break;
                case 7:
                    for(AssignmentsPerCourse a: listOfCoursesWithTheirAssignments){
                        System.out.println(a);
                    }
                    break;
                case 8:
                    for(AssignmentsPerStudent d: listOfStudentsWithTheirAssignments){
                        System.out.println(d);
                    }
                    break;
                default:
                    break;
            }
        } else{
            System.out.println("Please try again");
        }

        

    }
    
    public static String getDateToString(String dateInString) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        try {
            d = sdf.parse(dateInString);
        } catch (ParseException ex) {
            Logger.getLogger(PrivateSchoolMainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        String result = sdf.format(d);
        return result;

    }
    
 
    
}
