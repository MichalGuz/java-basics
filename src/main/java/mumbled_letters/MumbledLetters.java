package mumbled_letters;

import java.lang.reflect.Array;

public class MumbledLetters {

    //  Write function accum
    //  Examples:
    //      accum("abcd") -> "A-Bb-Ccc-Dddd"
    //      accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    //      accum("cwAt") -> "C-Ww-Aaa-Tttt"
    //  The parameter of accum is a string which includes only letters from a..z and A..Z.

    public static String accum(String n) {
        n = n.toLowerCase();
        char[] letters = n.toCharArray();
        int counter = 1;
        String temporaryString = "";
        String result = "";
        for (int i = 0; i < letters.length; i++ ){
            String retrievedLetter = Character.toString((char) Array.get(letters, i));
            for (int j = 1; j <= counter; j++) {
                temporaryString = retrievedLetter.toUpperCase();
                if ( j > 1) {
                    for (int k = 1; k < counter; k++) {
                        temporaryString = temporaryString + retrievedLetter;
                    }
                }
            }
            if ( i < letters.length - 1) {
                temporaryString = temporaryString + "-";
            }
            result = result + temporaryString;
            counter++;
        }
        System.out.println("The result of accum() method is: " + result);
        return result;
    }
}
