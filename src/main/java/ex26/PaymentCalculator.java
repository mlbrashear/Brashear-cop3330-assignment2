package ex26;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOf(double balance, double aprPercent, double mp) {
        //declare variables
        aprPercent = ((aprPercent / 100) / 365);
        double n = -(1/30.0) * Math.log10(1 + (balance/mp) * (1 - Math.pow((1 + aprPercent), 30.0))) / Math.log10(1 + aprPercent);
        //return findings
        return Math.ceil(n);
    }
}