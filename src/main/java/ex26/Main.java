package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declare variables
        double balance, apr, monthPayment;
        Scanner sc = new Scanner(System.in);
        PaymentCalculator p = new PaymentCalculator();
        //scan user input
        System.out.println("What is your balance?");
        balance = sc.nextDouble();
        System.out.println("What is the APR on the card (as a percent)? ");
        apr = sc.nextDouble();
        System.out.println("What is the monthly payment you can make? ");
        monthPayment = sc.nextDouble();

        //apr = ((apr / 100) / 365);
        //call to function and print out findings
        double n = p.calculateMonthsUntilPaidOf(balance, apr, monthPayment);
        System.out.println("It will take you " + (int)n + " months to pay off this card.");

        sc.close();
    }
}
