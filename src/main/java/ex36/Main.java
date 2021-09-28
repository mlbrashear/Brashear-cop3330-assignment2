package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import ex32.numberGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        ArrayList<String> num = new ArrayList<String>();
        String temp = " ";
        computingStatistics c = new computingStatistics();

        //Receive user input
        System.out.println("Enter a number:");
        while(!temp.equals("done")) {
            if(sc.hasNextInt()) {
                System.out.println("Enter a number:");
                num.add(sc.nextLine());
            }
            else {
                temp = sc.nextLine();
            }
        }

        //print out entered numbers
        System.out.println("Numbers:");
        for(int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }

        //call to classes
        double avg = c.average(num), std = c.std(num);
        int min = c.min(num), max = c.max(num);

        //print findings
        System.out.println("\nThe average is " + avg + "\nThe minimum is " + min + "\nThe maximum is " + max + "\nThe standard deviation is " + std);
    }
}