/*
 * ReverseNames.java
 * Hunter Quantz
 * 
 * This program takes user input for a name and returns it with 
 * the letters in the first and last names reversed.
 */
package reversenames;

import java.util.Scanner;

public class ReverseNames {

    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String name; //stores the name entered by the user
        String reverseName = ""; //stores the name when it has been reversed
        int indexOfSpace;//stores the index of the space
        
        System.out.println("Reverse Name by Hunter Quantz\n");
        System.out.print("What is your name? ");
        name = stdIn.nextLine();
        System.out.println(name);
        
        indexOfSpace = name.indexOf(" ");
        
        for(int i = indexOfSpace - 1; i >= 0; i--){
            reverseName += name.charAt(i);
        }
        
        System.out.println(reverseName);
    }//end main

}//end reversenames class
