package ex34;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
public class Main {
    public static void main(String[] args) {
        //declare variables
        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String remove;
        int temp = 10;
        Scanner sc = new Scanner(System.in);
        remove r = new remove();
        //print out employees names
        System.out.println("There are 5 employees:");
        for(int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
        //receive user input
        System.out.println("Enter an employee name to remove:");
        remove = sc.nextLine();

        temp = r.removeName(names, remove);

        System.out.println("There are 4 employees:");
        for(int i = 0; i < 5; i++) {
            if(i != temp)
                System.out.println(names[i]);
        }
    }
}