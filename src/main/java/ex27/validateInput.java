package ex27;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Mary Brashear
 */


public class validateInput {
    //Determine if the first name is valid
    public static int fn(String fn) {
        if(fn.length() >= 2)
            return 0;
        else if (fn.length() == 0){
            System.out.println("The first name must be filled in.\nThe first name must be at least 2 characters long.");
            return 1;
        }
        else
            System.out.println("The first name must be at least 2 characters long.");
        return 1;
    }
    public static int ln(String ln) {
        //Determine if the last name is valid
        if(ln.length() >= 2)
            return 0;
        else  if (ln.length() == 0){
            System.out.println("The last name must be filled in.\nThe last name must be at least 2 characters long.");
            return 1;
        }
        else
            System.out.println("The last name must be at least 2 characters long.");
        return 1;
    }
    public static int zipCode(String zip) {
        //Determine if the zip code is valid
        int count = 0;
        for(int i = 0; i < 5; i++) {
            if(zip.charAt(i) >= '0' && zip.charAt(i) <= '9') {
                count++;
            }
        }
        if(count == 5)
            return 0;
        else {
            System.out.println("The zipcode must be a 5 digit number.");
            return 1;
        }
    }
    public static int identification(String id) {
        //Determine if the ID is valid
        if(id.length() != 7)
            return 1;
        else if((id.charAt(0) >= 'a' && id.charAt(0) <= 'z') || (id.charAt(0) >= 'A' && id.charAt(0) <= 'Z')){
            if((id.charAt(1) >= 'a' && id.charAt(1) <= 'z') || (id.charAt(1) >= 'A' && id.charAt(1) <= 'Z')) {
                if(id.charAt(2) == '-') {
                    if(id.charAt(3) >= '0' && id.charAt(3) <= '9') {
                        if(id.charAt(4) >= '0' && id.charAt(4) <= '9') {
                            if(id.charAt(5) >= '0' && id.charAt(5) <= '9') {
                                if(id.charAt(6) >= '0' && id.charAt(6) <= '9'){
                                    return 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The employee ID must be in the format of AA-1234.");
        return 1;
    }

}
