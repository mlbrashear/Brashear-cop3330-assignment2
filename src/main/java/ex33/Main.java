package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        String wish;
        Scanner sc = new Scanner(System.in);
        random r = new random();


        //receive user input
        System.out.println("What's your question?");
        wish = sc.nextLine();

        int rand = r.rand();

        //use random numbers to display output
        if (rand == 1)
            System.out.println("Yes.");
        else if (rand == 2)
            System.out.println("No.");
        else if (rand == 3)
            System.out.println("Maybe.");
        else
            System.out.println("Ask again later.");

    }

}
