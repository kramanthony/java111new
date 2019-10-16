/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.*;

/**
 *
 * @author Mark Evans
 */
public class MovieChoice {
    public static void main(String[] args) {
        int response; // interval to track user input
        int buddyPoints = 0; // point system that tallies up based off of user's input
        Scanner scanChoice = new Scanner(System.in); // scanner to take in user input
    
        System.out.println("What's your favorite movie genere? 0 - Comedy, 1 - Horror, 2 - Sci-Fi"); // list of genres for user to select
        response = scanChoice.nextInt(); // set assigned expression
            while (response != 0 && response != 1 && response != 2) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
        if (response == 0) {
            buddyPoints = buddyPoints + 10;
            System.out.println("Do you like the movie 'Grown Ups' - 0, or 'Talladaga Nights' - 1?"); // display for when user chooses comedy
            response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
            }
            if (response == 0) {
                buddyPoints = buddyPoints + 10; 
                System.out.println("Lenny - 0 or Marcus - 1?");
                response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
                if (response == 0) {
                    System.out.println("Hilarious"); // choice for lenny
                    buddyPoints = buddyPoints + 10;
                }else if(response == 1){
                    System.out.println("Eh."); // choice for marcus
                    buddyPoints = buddyPoints + 5;
                }
            }
            else if (response == 1) {
                System.out.println("Ricky - 0 or Cal - 1?");
                response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
                if (response == 0);
                    System.out.println("Shake 'n Bake baby."); // display for ricky
                    buddyPoints = buddyPoints + 10;
                    
            }else{
                System.out.println("She's a gold digger."); // display for cal
                buddyPoints = buddyPoints + 5;
            }
        } // end if/else statement on line 21
        else if (response == 1) {
            buddyPoints = buddyPoints + 10;
            System.out.println("Do you like the movie 'Friday the 13th' - 0, or 'Nightmare on Elm Street' - 1?"); // choices when user selects horror
            response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
            if (response == 0) {
                System.out.println("Enos - 0 or Steve - 1?");
                response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
                if (response == 0) {
                    System.out.println("Amazing"); // choice for steve
                    buddyPoints = buddyPoints + 10;
                }else{
                    System.out.println("He was weird"); // choice for enos
                    buddyPoints = buddyPoints - 5;
                }
            }
            else if (response == 1) {
                System.out.println("Glen or Mr. Lautz?");
                response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
                if (response == 0) {
                    System.out.println("Argh!"); // choice for glen
                    buddyPoints = buddyPoints + 10;
                }else{
                    System.out.println("Airplane 2!"); // choice for Mr. Lautz
                    buddyPoints = buddyPoints + 5;
                }
            }
        
//            }else{
//                    
//                    }
               
        } // end else/if statement from line 47
        else if (response == 2) {
            buddyPoints = buddyPoints + 10;
            System.out.println("Do you like the movie 'Star Wars' - 0, or 'Star Trek' - 1?"); // choice when user chooses Sci-Fi
            response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
            if (response == 0) {
                System.out.println("Luke - 0 or Anakin - 1?");
                response = scanChoice.nextInt();
            while (response != 0 && response != 1) {
                System.out.println("That wasn't one of the fucking options fat fingers, try again.");
                response = scanChoice.nextInt();
            }
                if (response == 0) {
                    System.out.println("Ur tuff"); // choice for anakin
                    buddyPoints = buddyPoints + 15;
                }else{
                    System.out.println("Ur soft"); // choice for luke
                    buddyPoints = buddyPoints + 500;
                }
            } // end else/if
            else if (response == 1) {
            buddyPoints = buddyPoints - 10;
                System.out.println("Kirk or Spock?"); // if user selects Star Trek, they are given these two options.
                response = scanChoice.nextInt();
                
                if (response == 0) {
                    System.out.println("Chubby Face"); // choice for kirk
                    buddyPoints = buddyPoints - 5;
                }else{
                    System.out.println("Skinny Face"); // choice for spock
                    buddyPoints = buddyPoints + 10;
                }
            } // end else if

        } // end else/if from line 76
        System.out.println("Buddy Points: " + buddyPoints); // shows the user their amount of buddy points and tells them whether or not we can be friends.
        if (buddyPoints >= 60) {
            System.out.println("We can be friends.");
        }else{
            System.out.println("Blocked.");
        }

    
    } // end method
} // end class
     
     
     
     
