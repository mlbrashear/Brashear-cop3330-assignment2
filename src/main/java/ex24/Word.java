package ex24;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */


import java.util.Arrays;

public class Word {
    public static int isAnagram(String s1, String s2) {
        //declare variables
        int s1Length = s1.length();
        int s2Length = s2.length();

        //sort the arrays
        if(s1Length == s2Length) {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);

            //determine if the arrays are the same
            if(Arrays.equals(ArrayS1, ArrayS2))
                return 1;
            else
                return 0;
        }
        else {
            return 0;
        }

    }
}
