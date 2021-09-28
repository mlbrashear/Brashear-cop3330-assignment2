package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        String s1, s2;
        Word w = new Word();
        Scanner sc = new Scanner(System.in);
        //receive user input
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        s1 = sc.next();
        System.out.println("Enter the second string: ");
        s2 = sc.next();

        //call to function
        int i = w.isAnagram(s1, s2);

        //print out findings
        if(i == 1)
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams");
        else
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams");

        sc.close();
    }
}

