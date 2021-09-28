package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //declare variables
        ArrayList<String> names = new ArrayList<String>();
        String input = " ";
        int count = 0, min = 0;
        Scanner sc = new Scanner(System.in);
        randomNum r = new randomNum();
        //receive user input
        while(!input.equals("")) {
            System.out.println("Enter a name:");
            input = sc.nextLine();
            names.add(input);
            count++;
        }
        //randomly pick a number
        int random_int = r.random();
        //print findings
        System.out.println("The winner is... " + names.get(random_int) + ".");
    }
}
