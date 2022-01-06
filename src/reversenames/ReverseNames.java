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
        int nameLength; //stores the length of the name
        String letterToCapitalize = ""; //stores the letter to capitalize

        System.out.println("Reverse Name by Hunter Quantz\n");
        System.out.print("What is your name? ");
        name = stdIn.nextLine();
        nameLength = name.length();
        name = name.toLowerCase();

        indexOfSpace = name.indexOf(" ");

        for (int i = indexOfSpace - 1; i >= 0; i--) {
            if (i == indexOfSpace - 1) {
                letterToCapitalize += name.charAt(i);
                reverseName += letterToCapitalize.toUpperCase();
                letterToCapitalize = "";
            } else {
                reverseName += name.charAt(i);
            }

        }

        reverseName += " ";

        for (int i = nameLength - 1; i > indexOfSpace; i--) {
            if (i == nameLength - 1) {
                letterToCapitalize += name.charAt(i);
                reverseName += letterToCapitalize.toUpperCase();
            } else {
                reverseName += name.charAt(i);
            }
        }

        System.out.println(reverseName);
    }//end main

}//end reversenames class
