package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        int age, restingHR;
        double inten = 55.0, thr;
        Scanner sc = new Scanner(System.in);
        targetHR t = new targetHR();
        //scan user input
        System.out.println("What is your age?");
        age = sc.nextInt();
        System.out.println("What is your resting heart rate?");
        restingHR = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + "\tAge: " + age);


        //print findings and determine THR
        System.out.println("Intensity    | Rate\n-------------|--------");
        for(int i=0; i<9; i++) {
            thr = t.thr(age, restingHR, inten);
            //targetHR = (((220 - age) - restingHR) * (inten/100)) + restingHR;
            System.out.println((int)inten + "%          | " + (int)thr + "bpm");
            inten = inten + 5;
        }
    }
}
