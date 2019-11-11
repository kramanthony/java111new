package methods;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mark
 */
public class rollercoasterMidTerm {
    
    static int coinStart = 50;
    
    public static void main(String[] args) {
        System.out.println("Welcome to the mystical shop of math, where all cry!");
        System.out.println("Your goal is to progress through the different types of maths such as addition, subtraction and so on!");
        System.out.println("How it works you may ask? Simple, let me explain.");
        System.out.println("You are at a dang mystical shop that sells different types of math problems.");
        System.out.println("Do math problems to get money which will allow you to buy more types of math problems that give you more money!");
        System.out.println("Your goal is to buy the Mystical Dolphin for $10,000. Good luck.");
        System.out.println("Oh yeah, here's $50 to get you started.");
        System.out.println("");
        System.out.println("$50 Obtained!");
        
        shop();
        
    } // close main
    
    public static void shop() {
        
        Scanner userInput = new Scanner(System.in);
        int shopAnswer; // user input container for scanner
        boolean hasAddition = false;
        boolean hasSubtraction = false;
        boolean hasMultiplication = false;
        boolean hasDivision = false;
        boolean hasDolphin = false;
        
        System.out.println("Welcome to the Mystical Shop Hub!");
        System.out.println("Press 1 to buy addition");
        System.out.println("Press 2 to buy subtraction");
        System.out.println("Press 3 to buy multiplication");
        System.out.println("Press 4 to buy division");
        System.out.println("Press 5 to buy the Mystical Dolphin | Price: $10,000");
        shopAnswer = userInput.nextInt();
        
        switch(shopAnswer){
            case 1:
                
                System.out.println("You have just purchased addition problems! | Balance: " + coinStart);
                break;
            case 2:
                shopAnswer = 2;
                break;
            case 3:
                shopAnswer = 3;
                break;
            case 4:
                shopAnswer = 4;
                break;
            case 5:
                shopAnswer = 5;
                break;
        } // close switch
        
        if(shopAnswer == 1 && coinStart >= 50) {
            coinStart = coinStart - 50;
            hasAddition = true;
            System.out.println("You have unlocked the Addition problems!");
        } // close if for buying addition problems
        
        if(shopAnswer == 2 && coinStart >= 200) {
            coinStart = coinStart - 200;
            hasSubtraction = true;
            System.out.println("You have unlocked the Subtraction problems!");
        } // close if for buying subtraction problems
        
        if(shopAnswer == 3 && coinStart >= 500) {
            coinStart = coinStart - 500;
            hasMultiplication = true;
            System.out.println("You have unlocked the Multiplication problems!");
        } // close if for buying multiplication problems
        
        if(shopAnswer == 4 && coinStart >= 1000) {
            coinStart = coinStart - 1000;
            hasDivision = true;
            System.out.println("You have unlocked the Division problems!");
        } // close if for buying division problems
        
        if(shopAnswer == 5 && coinStart >= 10000) {
            hasDolphin = true;
            System.out.println("You have unlocked the Mystical Dolphin!");
        } // close if for buying mystical dolphin
        
        
    } // close shop
    
} // close class
