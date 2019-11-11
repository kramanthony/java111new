/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package methods;
import java.util.Scanner;

/**
 * Variable scope practice exercise loosely drawn from the film Inception
 * @author delores
 */
public class ScopePractice {
    Scanner userResponse = new Scanner(System.in);
    // member variables (aka fields, class members)
    static String hatType = "Baker's hat";
    int readResponse;
    yesResponse = "0";
    noResponse = "1";
    private static boolean davidInSubstrate = false;
    static String alarm = "System alert!";
    
    public static void main(String[] args) {
        System.out.println("[begin execution in main]");
        locateDanceStudio();
        switchControl();
        System.out.println("[end execution in main]");
    } // close main
    
    public static void locateDanceStudio(){
        System.out.println("Elise!");
        toggleDavidCondition();
    } // close method locateDanceStudio
    
    public static void turnKnobLeft(){
        knockOffHat();
        toggleDavidCondition();
        String bigBoss = "chairman";
        System.out.println("Visit the " + bigBoss);
        
    } // close method turnKnobLeft
    
    public static void knockOffHat(){
        System.out.println("Knocking off " + hatType);
        System.out.println(alarm);
        
    } // close method knockOffHat
    
    public static void accessPumpingStation(){
        String alarmAccess = "Unauthorized entry!";
        System.out.println(alarmAccess);
        
    } // close access pumping station
    
    private static void toggleDavidCondition(){
        davidInSubstrate = !davidInSubstrate;
        System.out.println("[toggled davidInsubstrate to " 
                + davidInSubstrate + "]");
    } // close toggleDavidCondition method
    
    public static void nothingSpecial(){
        // this does nothing at all
    } // close nothingSpecial
    
    public static void areYouReady(){
        System.out.println("Are you ready to SWITCH it up?");
        readResponse = userResponse.nextInt();
    } // close areYouReady
    public static void switchControl(){
        switch(readResponse){
            case 0:
                System.out.println("We've switched it up!");
                break;
            case 1:
                System.out.println("We haven't switched it up.");
                break;
        } // closes switch
    } // closes switchControl method
   
} // close class ScopePracticeKey