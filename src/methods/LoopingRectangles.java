/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

/**
 * This class is going to create a box and also have some modifications.
 * @ Author Mark
 */
public class LoopingRectangles {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        // variables to keep track 
        int widthMax = 15; // lays out 10 'symbol'
        int widthPosition = 0; // keeps track of rowCount during while loop to make sure it lays out 10 times.
        int heightMax = 20; // make a rectangle, not a square
        int heightPosition = 0; // assigns value of zero for pos
        int userInputWidth;
        int userInputHeight;
        String symbol = "*"; // symbol for the box
        
        System.out.println("How wide would you like your shape to be?");
        userInputWidth = inputScanner.nextInt();
        System.out.println("How tall would you like your shape to be?");
        userInputHeight = inputScanner.nextInt();
        
        // controlling the left/right pos of our counter
        while(heightPosition <= userInputWidth){
            while(widthPosition <= userInputHeight){
                System.out.print(symbol);
                widthPosition++;
            } // close while
            System.out.println("");
            heightPosition++;
            widthPosition  = 0;
        } // close while
        triangle();
    } // close main
    
    public static void triangle(){
        Scanner inputScanner = new Scanner(System.in);
        int userInputWidth;
        int userInputHeight;
        int oneSpace = 3;
        int twoSpace = 3;
        String symbol = "*";
        int count = 0;
        //HINT: Try only taking in the height.  
        //HINT 2
        
//        System.out.println("How wide would you like your shape to be?");
//        userInputWidth = inputScanner.nextInt();
        System.out.println("How tall would you like your shape to be?");
        userInputHeight = inputScanner.nextInt();
        
        while(count < userInputHeight){
            String t = symbol;
            for(int i = 0; i < count; i++){
                t +=  symbol;
                t +=  symbol;
            }
            System.out.println(t);
            count++;
        }
    }
} // close class
