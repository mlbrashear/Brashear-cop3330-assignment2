package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
public class Main {
    public static void main(String[] args) {
        //create for loop nested inside for loop to make the times table
        for (int x = 1; x <= 12; ++x) {
            for (int y = 1; y <= 12; ++y) {
                System.out.printf("%4d", x * y);
            }
            System.out.println();
        }
    }
}