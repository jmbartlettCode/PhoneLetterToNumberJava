/*
 * Josh Bartlett
 * Purpose: Translate a phone number input with letters and
 * return with all numbers.
 * May 18, 2019
 * Bellevue University
 * phoneLetterToNum.java
 */

import java.util.Scanner;

public class phoneLetterToNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Prompt user for input of phone number with letters
        System.out.print("Enter a string: ");
        String inputNum = input.nextLine();
        
        // Converts any lower case letters to upper case
        inputNum = inputNum.toUpperCase();
        
        // For loop to go through each char and display result
        for(int i = 0; i < inputNum.length(); i++){
            if(Character.isLetter(inputNum.charAt(i)))
                System.out.print(getNumber(inputNum.charAt(i)));
            else
                System.out.print(inputNum.charAt(i));
        }
        System.out.println();
    }
    
    // Method to change letters to numbers
    public static int getNumber(char uppercaseLetter){
        if(uppercaseLetter == 'A')
            return 2;
        else if(uppercaseLetter == 'B')
            return 2;
        else if(uppercaseLetter == 'C')
            return 2;
        else if(uppercaseLetter == 'D')
            return 3;
        else if(uppercaseLetter == 'E')
            return 3;
        else if(uppercaseLetter == 'F')
            return 3;
        else if(uppercaseLetter == 'G')
            return 4;
        else if(uppercaseLetter == 'H')
            return 4;
        else if(uppercaseLetter == 'I')
            return 4;
        else if(uppercaseLetter == 'J')
            return 5;
        else if(uppercaseLetter == 'K')
            return 5;
        else if(uppercaseLetter == 'L')
            return 5;
        else if(uppercaseLetter == 'M')
            return 6;
        else if(uppercaseLetter == 'N')
            return 6;
        else if(uppercaseLetter == 'O')
            return 6;
        else if(uppercaseLetter == 'P')
            return 7;
        else if(uppercaseLetter == 'Q')
            return 7;
        else if(uppercaseLetter == 'R')
            return 7;
        else if(uppercaseLetter == 'S')
            return 7;
        else if(uppercaseLetter == 'T')
            return 8;
        else if(uppercaseLetter == 'U')
            return 8;
        else if(uppercaseLetter == 'V')
            return 8;
        else
            return 9;
    }
}
