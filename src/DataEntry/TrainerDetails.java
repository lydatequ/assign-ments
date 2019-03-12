package DataEntry;

import Entities.Trainer;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainerDetails {
    
    public Trainer getDetails(Scanner sc) {
        Trainer trainer1 = new Trainer();
        System.out.println("Please give me your First Name and Last Name: ");
        trainer1.setFirstName(sc.next()); 
        trainer1.setLastName(sc.next());
        System.out.println("Please write the Subject you are going to teach: ");
        trainer1.setSubject(sc.next());
        
        return(trainer1);
    }
    
    public ArrayList <Trainer> getMultipleTrainers(Scanner sc){
        Trainer trainer1 = new Trainer();
        ArrayList <Trainer> trainers = new ArrayList <Trainer>();
        boolean evaluateUsersInput;

        do {
            trainer1 = getDetails(sc);
            trainers.add(trainer1);
            System.out.println(trainer1);
            evaluateUsersInput = sc.next().equals("quit");
        } while (!evaluateUsersInput);
        
        return (trainers);
    }
}