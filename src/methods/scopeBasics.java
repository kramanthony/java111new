/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author Mark Evans
 */
public class scopeBasics {

    //class scoped variable
    private static String classScopedVar = "All methods can access me!";
    private static String localScope1;
    private static String localScope2;
    
    
    
    
    
    public static void demonstrateScope() {
        System.out.println("Inside demonstrateScope");
        
        String localScope2 = "I'm local to potato";
        System.out.println(localScope1);
        
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        
        classScopedVar = "I can be changed in any method";
    } // close demonstrateScope
    
    
    
    
    
    public static void main(String[] carrot) {
        System.out.println("Inside main");
        String localScope1 = "I'm local to main";
        
        System.out.println(localScope1);
        System.out.println(classScopedVar);
        System.out.println(localScope2);
        
        demonstrateScope();
    } // close main
}        // close class
