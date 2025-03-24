package org.example;

public class ConvertUnitVowel {
    //use do while loop for this exercise
    public static String convertUntilVowel(String str) {
        int index = 0;
        StringBuilder res = new StringBuilder();
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        do {
            if (index >= str.length()) {
                break;
            }
            char character = str.charAt(index);
            boolean isVowel = false;
            for (char vowel : vowels) {
                if (Character.toLowerCase(character) == vowel) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) {
                res.append(Character.toUpperCase(character));
            }
            else {
                res.append(character);
            }
            index++;
        }
        while(index < str.length());
        return res.toString();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
