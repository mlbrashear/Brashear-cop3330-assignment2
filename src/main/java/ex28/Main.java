package ex28;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        int total = 0, userInput;
        input i = new input();
        Scanner sc = new Scanner(System.in);

        for(int j = 0; j < 5; j++) {
            System.out.println("Enter a number:");
            userInput = sc.nextInt();
            total = i.inpt(userInput, total);
        }
        //print findings
        System.out.println("The total is " + total + ".");
    }
}
