package ex25;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */
public class passwordValidator {
    public static int password(String s) {
        //declare variables
        int count = 0, letters = 0, num = 0, special = 0;
        //determine what type of char is being shown
        for(int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                letters++;
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                num++;
            else
                special++;
            count++;
        }

        //determine how many characters
        if(count < 8) {
            if(letters == 0)
                return 0;
            else
                return 1;
        }
        //determine strength
        else {
            if((letters >= 1) && (num >=1) && (special == 0))
                return 2;
        }
        return 3;
    }
}
