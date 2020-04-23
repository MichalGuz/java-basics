package boolean_letters_counter;

import org.junit.Test;

public class BooleanLettersCounterTestSuite {
    @Test
    public void testcompareAmountOfXAndOLetters() {
        // given
        BooleanLettersCounter b = new BooleanLettersCounter();
        String s1 = "xo";
        String s2 = "xxo";
        String s3 = "zqq";
        String s4 = "abcdoqweoazsdxplerx";
        String s5 = "ooooooooooooo";
        String s6 = "xxxxxxx";
        String s7 = "xpoxoppoxopxpoxxopxopxopxpoxpoopxopx";

        //when
        boolean attempt1 = b.compareAmountOfXAndOLetters(s1);
        boolean attempt2 = b.compareAmountOfXAndOLetters(s2);
        boolean attempt3 = b.compareAmountOfXAndOLetters(s3);
        boolean attempt4 = b.compareAmountOfXAndOLetters(s4);
        boolean attempt5 = b.compareAmountOfXAndOLetters(s5);
        boolean attempt6 = b.compareAmountOfXAndOLetters(s6);
        boolean attempt7 = b.compareAmountOfXAndOLetters(s7);
    }
}
