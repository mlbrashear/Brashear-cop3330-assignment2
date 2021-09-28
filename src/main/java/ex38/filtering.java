package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */


public class filtering {
    public static int[] filterEvenNumbers(int[] numbers, int size) {
        //declare variables
        int[] evens = new int[size];
        //sort through to find which numbers are even
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens[count] = numbers[i];
                count++;
            }
        }
        //return even numbers
        return evens;
    }
}
