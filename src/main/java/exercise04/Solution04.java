/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohit Ballikar
 */
package exercise04;
import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scannoun = new Scanner(System.in);
        Scanner scanverb = new Scanner(System.in);
        Scanner scanadjective = new Scanner(System.in);
        Scanner scanadverb = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = scannoun.next();

        System.out.print("Enter a verb: ");
        String verb = scanverb.next();

        System.out.print("Enter an adjective: ");
        String adjective = scanadjective.next();

        System.out.print("Enter an adverb: ");
        String adverb = scanadverb.next();

        System.out.print("Why did you " + adverb + " " + verb + " the " + adjective + " " + noun + "?" + " That's hilarious! ");
    }
}

/*
    Import the necessary scanner functionality for user input storage
    Define scanners for user input for noun, verb, adjective, and adverb
    Prompt the user for and store each of the above components
    Output the comical statement in mostly logical order for the user
 */