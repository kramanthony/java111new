package methods;
import java.util.Scanner;
import java.util.Random;

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
    
    static int coinStart = 1000;
    static final int min = 0;
    static final int max = 30;
    static final int minMult = 0;
    static final int maxMult = 12;
    static final double maxDiv = 20.0;    
    
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
        
        if(shopAnswer == 1 && coinStart >= 50) {
            coinStart = coinStart - 50;
            hasAddition = true;
            System.out.println("You have unlocked the Addition problems! Balance: " + coinStart);
            doAddition();
        }else{
            if(coinStart < 50) {
                System.out.println("Sorry, you don't have enough money to purchase thiszzzz");
            }else{
                if (shopAnswer == 2 && coinStart >= 200) {
                    coinStart = coinStart - 200;
                    hasSubtraction = true;
                    System.out.println("You have unlocked the Subtraction problems! Balance: " + coinStart);
                    doSubtraction();
                }else{
                    if(coinStart < 200) {
                        System.out.println("Sorry, you don't have enough money to purchase this!");
                    }else{ // close if for buying subtraction problems
                        if(shopAnswer == 3 && coinStart >= 500) {
                            coinStart = coinStart - 500;
                            hasMultiplication = true;
                            System.out.println("You have unlocked the Multiplication problems! Balance: " + coinStart);
                            doMultiplication();
                        }else{
                            if(coinStart < 500) {
                            System.out.println("Sorry you don't have enough money to purchase this!");
                            }else{
                                if(shopAnswer == 4 && coinStart >= 1000) {
                                    coinStart = coinStart - 1000;
                                    hasDivision = true;
                                    System.out.println("You have unlocked the Division problems! Balance: " + coinStart);
                                    doDivision();
                                }else{
                                    if(coinStart < 1000) {
                                        System.out.println("Sorry, you don't have enough money to purchase this!");
                                }else{ // close if for buying division problems
                                if(shopAnswer == 5 && coinStart >= 10000) {
                                            hasDolphin = true;
                                            System.out.println("You have unlocked the Mystical Dolphin! Balance: " + coinStart);
                                        }else{
                                            if(coinStart < 10000) {
                                                System.out.println("Sorry, you don't have enough money to purchase this!");
                                            } // close if for buying mystical dolphin
                                    }
                                    }
                            }
                        }
                    }
                }
                }
                }
        }// close else
        } 
        
     // close shop
    public static void doAddition() {
        Random rdm = new Random();
        int startCounter = 0;
        int finCounter = 25;

        
        while(startCounter <= finCounter){
            int numberone = rdm.nextInt(max);
            int numbertwo = rdm.nextInt(max);
            int sum = numberone + numbertwo;
            System.out.println(numberone + " + " + numbertwo);
            int answer = grabInput();
            if(answer == sum) {
                coinStart += 13;
                System.out.println("Correct!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
            } else if(answer != sum){
                coinStart -= 13;
                System.out.println("Incorrect!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
                } // close else
            }
        } // close doAddition
    
    public static void doSubtraction() {
        Random rdm = new Random();
        int startCounter = 0;
        int finCounter = 25;

        
        while(startCounter <= finCounter){
            int numberone = rdm.nextInt(max);
            int numbertwo = rdm.nextInt(max);
            int diff = numberone - numbertwo;
            System.out.println(numberone + " - " + numbertwo);
            int answer = grabInput();
            if(answer == diff) {
                coinStart += 13;
                System.out.println("Correct!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
            } else if(answer != diff){
                coinStart -= 13;
                System.out.println("Incorrect!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
                } // close else
            }
        } // close doSubtraction
    
    public static void doMultiplication() {
        Random rdm = new Random();
        int startCounter = 0;
        int finCounter = 25;

        
        while(startCounter <= finCounter){
            int numberone = rdm.nextInt(maxMult);
            int numbertwo = rdm.nextInt(maxMult);
            int prod = numberone * numbertwo;
            System.out.println(numberone + " * " + numbertwo);
            int answer = grabInput();
            if(answer == prod) {
                coinStart += 13;
                System.out.println("Correct!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
            } else if(answer != prod){
                coinStart -= 13;
                System.out.println("Incorrect!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
                } // close else
            }
        } // close doMultiplication
    
    public static void doDivision() {
        Random rdm = new Random();
        int startCounter = 0;
        int finCounter = 25;

        
        while(startCounter <= finCounter){
            int numberone = rdm.nextInt(max);
            int numbertwo = rdm.nextInt(max);
            double div = (double) numberone / numbertwo;
            System.out.println(numberone + " / " + numbertwo);
            System.out.println(div);
            double answer = grabDivInput();
            if(answer == div) {
                coinStart += 13;
                System.out.println("Correct!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
            } else if(answer != div){
                coinStart -= 13;
                System.out.println("Incorrect!");
                System.out.println("");
                System.out.println("Balance: " + coinStart);
                System.out.println("");
                startCounter = startCounter + 1;
                } // close else
            }
        } // close doDivision
    
    public static double grabDivInput() {
        Scanner input = new Scanner(System.in);
        double answer = input.nextDouble();
        return answer;
    }


    public static int grabInput() {
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        return answer;
    }
} // close class
