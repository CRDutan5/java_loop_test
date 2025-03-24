package org.example;

public class FilterNumbers {
     //use do for loop for this exercise
    public static String filterNumbers(String str) {
        String res = "";
        char[] nums = {'1', '2', '3', '4', '5', '6','7', '8', '9', '0'};

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            boolean isNumber = false;

            for (char num : nums) {
                if (num == character) {
                    isNumber = true;
                    break;
                }
            }
            if (!isNumber) {
                res += character;
            }
        }
        return res;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
