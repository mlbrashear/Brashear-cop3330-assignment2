package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        int difficulty, guesses;
        String yn = "y", no = "n";
        Scanner sc = new Scanner(System.in);
        numberGame n = new numberGame();

        System.out.println("Let's play Guess the Number!\nEnter the difficulty level (1, 2, or 3):");
        difficulty = sc.nextInt();

        while(!yn.equals(no)) {
            if (difficulty == 1)
                guesses = n.diff1();
            else if (difficulty == 2)
                guesses = n.diff2();
            else
                guesses = n.diff3();

            System.out.println("You got it in " + guesses + " guesses!\nDo you wish to play again (Y/N)?");

            yn = sc.next();

            if(!yn.equals(no)) {
                System.out.println("Enter the difficulty level (1, 2, or 3):");
                difficulty = sc.nextInt();
            }

        }
    }
}

