package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //declare variables
        filtering f = new filtering();
        Scanner sc = new Scanner(System.in);
        //Receive user input
        System.out.println("Enter a list of numbers, separated by spaces: ");
        String sString = sc.nextLine();
        String[] arr = sString.split("\\s+");
        //fill array
        int[] num = new int[arr.length];
        int i;
        for(i=0;i< arr.length;i++)
        {
            String temp = arr[i];
            num[i] =Integer.parseInt(temp);
        }
        //find size of array
        int evenCount = 0;
        for(int j= 0; j < num.length; j++){
            if(num[j] % 2 == 0)
                evenCount++;
        }
        //make array for even numbers
        int[] evens = new int[evenCount];

        //call class
        evens = f.filterEvenNumbers(num, evenCount);

        //print findings
        System.out.print("The even numbers are ");
        for(int j = 0; j < evens.length; j++)
            System.out.print(evens[j] + " ");
    }
}