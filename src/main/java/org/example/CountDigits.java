package org.example;

public class CountDigits {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }


    //use do while loop for this exercise
    public static int countDigits(int num) {
        int counter = 0;

        if (num == 0) return 1;

        do {
            num = num / 10;
            counter++;
        }
        while(num > 0);
        return counter;

    }

}
