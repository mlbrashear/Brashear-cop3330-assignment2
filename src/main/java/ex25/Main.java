package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variables
        passwordValidator p = new passwordValidator();
        //receive user input
        System.out.println("Enter a password");
        String input = sc.nextLine();

        //use password class
        int i = p.password(input);

        //print out findings
        if(i == 0)
            System.out.println("The password '" + input + "' is a very weak password.");
        else if(i == 1)
            System.out.println("The password '" + input + "' is a weak password.");
        else if(i == 2)
            System.out.println("The password '" + input + "' is a strong password.");
        else
            System.out.println("The password '" + input + "' is a very strong password.");

        sc.close();
    }
}
