/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
        
/**
 *
 * @author mark.evans2358
 */
public class RetirementAge {
    
    public static void main(String[] args) {
        int age;
        int amount;
        int young = 0;
        int old = 0;
        double counter = 0;
        int ageAdd = 0;

        
        
        // make a Scanner object and store in a variable whose name we can choose
        Scanner inputScanner = new Scanner(System.in);
        
        /* the test condition for this  while statement is always true,
        so the looping will occur until the user issues a command to the compiler
        to stop execution
        */
        while(true){
            //prompt the user for age
            System.out.println("Enter your age to see if you can retire:");
            // read age from the console and store in variable
            age = inputScanner.nextInt();
            // implement basic if() logic--if they're over 65.5
            if(age >= 65){
                // if true
                System.out.println("How much money do you have in the bag?");
                amount = inputScanner.nextInt(); // read user's input
                old = old + 1;
                if(amount >= 30000){ // check to see if user's input is higher than 30 grand.
                    System.out.println("You're ready chief, hookers and blow!");
                    System.out.println("Young People: " + young);
                    System.out.println("Old People: " + old);

                }else{
                    System.out.println("Time to work two jobs.");  /* check to see if user's input is lower than 30 grand.*/
                    System.out.println("Young People: " + young);
                    System.out.println("Old People: " + old);
                }
                    
            } else if (age < 65) {
                young = young + 1;
                // the magical break; if this statement is hit, jump to after while ()
                System.out.println("Sorry, keep working...");
                System.out.println("Young People: " + young);
                System.out.println("Old People: " + old);

                // if hey can't retire and they have a real age, they're too young

                
            } // close if/else
            System.out.println("Would you like to add another age? 'Enter 0 to continue and 1 to stop.");
            int yayOrNay = inputScanner.nextInt();
            while(yayOrNay != 0 && yayOrNay != 1) {
                System.out.println("FACK YOU THAT WASN'T ONE OF THE OPTIONS YOU OPTIMUS PRIME BUILT ASS");
                yayOrNay = inputScanner.nextInt();
            }
            counter += 1;
            ageAdd += age;
            if (yayOrNay == 1) {
                System.out.println("End.");
                break;
            }
            
        } // close while() loop
        double averageAge = ageAdd / counter;
        System.out.println("Average Age: " + averageAge);
    }  // close main
} // close class
