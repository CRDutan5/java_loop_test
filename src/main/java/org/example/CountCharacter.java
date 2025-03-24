package org.example;

public class CountCharacter {
     //use do for loop for this exercise
    public static int countCharacter(String str, char target) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character == target) {
                counter++;
            }
        }
        return counter;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
