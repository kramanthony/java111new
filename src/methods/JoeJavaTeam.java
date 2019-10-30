/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 *
 * @author Mark
 */
public class JoeJavaTeam {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        String nameAnswer; // Question number 1 String
        String codingAnswer; // Question number 2 String
        int coopAnswer; // Question number 3 Integer
        String yesResponse = "y";
        String noResponse = "n";
        double totalScore = 0;
        
        System.out.println("Hello! Thank you for taking the time to take the JoeJava Team survey!");
        System.out.println("");
        System.out.println("We've got a couple of questions for you to answer, please use the following syntax for yes and no answers:");
        System.out.println("y - Yes.");
        System.out.println("n - No.");
        System.out.println("");
        System.out.println("Use the following syntax for ratings 1-10.");
        System.out.println("1 - Worst.");
        System.out.println("10 - Best.");
        System.out.println("");
        System.out.println("Question #1:");
        System.out.println("What's your name?");
        nameAnswer = userInput.nextLine();
        System.out.println("");
        System.out.println("How's it going, " + nameAnswer + "?");
        System.out.println("");
        System.out.println("Question #2:");
        System.out.println("Do you like coding?");
        codingAnswer = userInput.nextLine();
        
        // if else statement begins here:
        if(codingAnswer.equalsIgnoreCase(yesResponse)){
            totalScore = totalScore + 1; // +1 to total score for response "y"
        }else{
            if(codingAnswer.equalsIgnoreCase(noResponse)){
                totalScore = totalScore -1;
            } // close if
        } // close else
        
        System.out.println("");
        System.out.println("Question #3:");
        System.out.println("On a scale of 1-10, 10 being the best, how well do you believe you work with others?");
        coopAnswer = userInput.nextInt();
        switch(coopAnswer){
            case 0:
                totalScore = totalScore - 4;
                break;
            case 1:
                totalScore = totalScore - 3;
                break;
            case 2:
                totalScore = totalScore - 2;
                break;
            case 3:
                totalScore = totalScore - 1;
                break;
            case 4:
                totalScore = totalScore - 0;
                break;
            case 5:
                totalScore = totalScore + 1;
                break;
            case 6:
                totalScore = totalScore + 2;
                break;
            case 7:
                totalScore = totalScore + 3;
                break;
            case 8:
                totalScore = totalScore + 4;
                break;
            case 9:
                totalScore = totalScore + 5;
                break;
        } // end switch
        
        System.out.println("");
        System.out.println("Question #4:");
        System.out.println("Do you like the idea of integrating ideas from what we've learned in class into a bunch of projects?");
        String integrateIdea = userInput.nextLine();
        System.out.println("");
        
        if(integrateIdea.equals("y")) {
            totalScore = totalScore + 1;
            
        } // end if statement
        System.out.println("SURVEY COMPLETED");
        System.out.println("");
        System.out.println("Score: " + totalScore);
        System.out.println("");
        
        if(totalScore >= 5) {
            System.out.println("Hey! We'd like you to join the JoeJava Team, you'd be a great fit!");
        } // close if
        if(totalScore <= 4) {
            System.out.println("Hey! thank you for completing our survey, keep on coding!");
        }
        
    } // close main
    
} // close class
