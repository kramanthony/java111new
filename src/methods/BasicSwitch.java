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
public class BasicSwitch {
    public static void main(String[] args) {
        System.out.println("Select numbers; 1, 2, 78, or don't.");
        Scanner readResponse = new Scanner (System.in);
        int userInput = readResponse.nextInt();
            if(userInput == 1){
                System.out.println("First case selected");  
            }else{ // close if statement, open else
                if(userInput == 2){
                    System.out.println("Second case selected");
                }else{
                    if(userInput == 78){
                        System.out.println("Third case selected");
                    }else{
                        System.out.println("Default case");
                        } // close else for default case
                    } // close else for if input = 78
                } // close else for if input = 2
    } // close method
} // close class