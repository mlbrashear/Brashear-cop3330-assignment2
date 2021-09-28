package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        String firstName, lastName, id, zip;
        Scanner sc = new Scanner(System.in);
        validateInput v = new validateInput();
        //scan user input
        System.out.println("Enter the first name:");
        firstName = sc.nextLine();
        System.out.println("Enter the last name:");
        lastName = sc.nextLine();
        System.out.println("Enter the ZIP code:");
        zip = sc.nextLine();
        System.out.println("Enter the employee ID:");
        id = sc.nextLine();
        //call to class
        int fn = v.fn(firstName);
        int ln = v.ln(lastName);
        int zipCode = v.zipCode(zip);
        int ident = v.identification(id);

        //print findings if there are no errors
        if((fn==0) && (ln==0) && (zipCode==0) && (ident==0))
            System.out.println("There were no errors found.");

        sc.close();
    }
}
