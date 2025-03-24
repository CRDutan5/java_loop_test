package org.example;

public class ReverseString {
    //use do while loop for this exercise
    public static String reverseString(String str) {
        if (str.isEmpty()) return "";
        int index = str.length() - 1;
        String res = "";
        do {
            res += str.charAt(index);
            index--;
        }
        while (index >= 0);
        return res;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
