/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;
/**
 * Adding user input to our while loop learning
 * @author Mark Evans
 */
public class WhileWithScanner {
    public static void main(String[] args) {
        int numLoops = 1;
        int loopControl;
        String s;
        // build a scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt user and get an int from them
        System.out.println("How many loops shall I print?");
        loopControl = scanner.nextInt();
        System.out.println("What string should I print?");
        s = scanner.nextLine();
        loopControl = scanner.nextInt();
        // loop as long as numLoops is less than or equal to our loopControl
        // which we gathered from the user
        while(numLoops <= loopControl) {
            System.out.println("The value of numLoops: " + numLoops);
            System.out.println("Your Text: " + s);
            // add one to numLoops each time we cycle so we only
            // loop the number of times the user imputed
            numLoops = numLoops + 1;
        } // close while
    
    System.out.println("...After the while loop");
    
    } // close main
} // close class
