package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        int numSpecial, numNumbers, numLetters, length;
        ArrayList<String> password = new ArrayList<String>();
        Random r = new Random();
        char[] special = new char[]{'~', '!', '@', '#', '$', '%', '^', '&', '<', '|', '?', '-', ';', '+', '='};

        //Receive user input
        System.out.println("What's the minimum length?");
        length = sc.nextInt();
        System.out.println("How many special characters?");
        numSpecial = sc.nextInt();;
        System.out.println("How many numbers? ");
        numNumbers = sc.nextInt();

        numLetters = length - (numNumbers + numSpecial);

        //randomly receive character
        for(int i = 0; i < length; i++) {
            int rand = (int)Math.floor(Math.random()*(3-1+1)+1);
            if((rand == 1) && (numLetters != 0)) { // picking a letter
                char c = (char)(r.nextInt(26) + 'a');
                String s = String.valueOf(c);
                password.add(s);
                numLetters--;
            }
            else if((rand == 2) && (numSpecial != 0)) { // picking a special character
                int randS = (int)Math.floor(Math.random()*(special.length+1)+0);
                String temp = String.valueOf(special[randS]);
                password.add(temp);
                numSpecial--;
            }
            else {
                int random_int = (int)Math.floor(Math.random()*(10-1+1)+1);
                String temp = String.valueOf(random_int);
                password.add(temp);
                numNumbers--;
            }
        }
        //print out new password
        System.out.println("Your password is ");
        for(int i = 0; i < password.size(); i++)
            System.out.println(password.get(i));
    }
}
