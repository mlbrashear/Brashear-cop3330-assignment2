package ex32;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */


public class numberGame {
    public static int diff1() {
        //declare variables
        int min = 1, max = 10, counter = 0, guess = 0;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        //keep the user guessing until they guess the right number
        while(guess != random_int) {
            if(sc.hasNextInt()) {
                guess = sc.nextInt();
                if(guess > random_int) {
                    System.out.println("Too high. Guess again:");
                    counter++;
                }
                else if(guess < random_int){
                    System.out.println("Too low. Guess again:");
                    counter++;
                }
            }
            else {
                System.out.println("Invalid input");
                counter++;
                temp = sc.nextLine();
            }
        }
        return counter;
    }
    public static int diff2() {
        //declare variables
        int min = 1, max = 100, counter = 0, guess = 0;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        //keep the user guessing until they guess the right number
        while(guess != random_int) {
            if(sc.hasNextInt()) {
                guess = sc.nextInt();
                if(guess > random_int) {
                    System.out.println("Too high. Guess again:");
                    counter++;
                }
                else if(guess < random_int){
                    System.out.println("Too low. Guess again:");
                    counter++;
                }
            }
            else {
                System.out.println("Invalid input");
                counter++;
                temp = sc.nextLine();
            }
        }
        return counter;
    }
    public static int diff3() {
        //declare variables
        int min = 1, max = 1000, counter = 0, guess = 0;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        String temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        //keep the user guessing until they guess the right number
        while(guess != random_int) {
            if(sc.hasNextInt()) {
                guess = sc.nextInt();
                if(guess > random_int) {
                    System.out.println("Too high. Guess again:");
                    counter++;
                }
                else if(guess < random_int){
                    System.out.println("Too low. Guess again:");
                    counter++;
                }
            }
            else {
                System.out.println("Invalid input");
                counter++;
                temp = sc.nextLine();
            }
        }
        return counter;
    }
}
