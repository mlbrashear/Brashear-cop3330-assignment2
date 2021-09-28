package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */


import java.util.ArrayList;

public class computingStatistics {
    public static double average(ArrayList<String> arr) {
        //declare variables
        int size = arr.size();
        double temp, total = 0;
        for(int i = 0; i < size; i++) {
            temp = Double.parseDouble(arr.get(i));
            total = total + temp;
        }
        total = (total / size);
        //return the average
        return Math.round((total)*100.0)/100.0;
    }
    public static int max(ArrayList<String> arr) {
        //declare variables
        int max = Integer.parseInt(arr.get(0)), temp, size = arr.size();
        for(int i = 0; i < size; i++) {
            temp = Integer.parseInt(arr.get(i));
            if(max < temp)
                max = temp;
        }
        //return the max number
        return max;
    }
    public static int min(ArrayList<String> arr) {
        //declare variables
        int min = Integer.parseInt(arr.get(0)), temp, size = arr.size();
        for(int i = 0; i < size; i++) {
            temp = Integer.parseInt(arr.get(i));
            if(min > temp)
                min = temp;
        }
        //return the min number
        return min;
    }
    public static double std(ArrayList<String> arr) {
        //declare variables
        int numArray[];
        double sum = 0.0, standardDeviation = 0.0;
        int length = arr.size();
        numArray = new int[length];

        for(int i = 0; i < length; i++){
            numArray[i] = Integer.parseInt(arr.get(i));
        }

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        //return the STD
        return Math.round((Math.sqrt(standardDeviation/length)*100.0)/100.0);
    }
}
