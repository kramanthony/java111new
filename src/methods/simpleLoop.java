/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 * Demo of while loop
 * @author Mark Evans
 */
public class simpleLoop {
    public static void main(String[] bananaFrenzy) {
        int count = 0;
        int numLoops = 900000;
        long startTime = System.currentTimeMillis();
        long endTime; // convention is to declare all vars at top of method
        
        System.out.println("Before looping at " + startTime);
        
        // as long as count < numLoops,
        // execute my block { ... }
        while(count < numLoops) {
            System.out.println("Val of Count: " + count);
            count = count + 1;
        } // close while
        endTime = System.currentTimeMillis();
        System.out.println("Stopped looping at " + endTime);
        long totalTimeMs = endTime - startTime;
        System.out.println("Total Time to Run: " + totalTimeMs);
        long totalTimeS = totalTimeMs / 1000;
        System.out.println("Total Time Seconds: " + totalTimeS);
        long totalTimeM = totalTimeS / 60;
        System.out.println("Total Time Minutes: " + totalTimeM);
    } // close main
} // close class
