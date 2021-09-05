/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Gabriel Telleria
 */

import java.util.Scanner;

/*
Prompt the user for a noun
    save input into 'noun'
Prompt the user for a verb
    save input into 'verb'
Prompt the user for an adjective
    save input into 'adjective'
Prompt the user for an adverb
    save input into 'adverb'
Print "Do you <verb> your <adjective> <noun> <adverb>? That's hilarious!"
 */
public class Solution04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a noun: ");
        String noun = input.nextLine();
        System.out.printf("Enter a verb: ");
        String verb = input.nextLine();
        System.out.printf("Enter a adjective: ");
        String adjective = input.nextLine();
        System.out.printf("Enter a adverb: ");
        String adverb = input.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
