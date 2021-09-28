package ex29;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import ex27.validateInput;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        //declare variables
        String temp = " ";
        int r, count = 0;
        year y = new year();
        Scanner sc = new Scanner(System.in);
        //scan user input and determine if its valid
        while(count != temp.length()){
            System.out.println("What is the rate of return?");
            temp = sc.nextLine();
            count = 0;
            if(temp.equals("0"))
                System.out.println("Sorry. That's not a valid input");

            else {
                for (int i = 0; i < temp.length(); i++) {
                    if ((temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z') || (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z')) {
                        System.out.println("Sorry. That's not a valid input.");
                        break;
                    } else
                        count++;
                }
            }
        }
        r = Integer.parseInt(temp);
        //print findings
        System.out.println("It will take " + y.years(r) + " years to double your initial investment");


    }
}