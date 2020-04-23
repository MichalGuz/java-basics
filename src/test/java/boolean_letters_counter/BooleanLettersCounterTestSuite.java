package boolean_letters_counter;

import org.junit.Assert;
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
        String s8 = "Xoprxo";
        String s9 = "lllOOOxxX";

        //when
        boolean attempt1 = b.compareAmountOfXAndOLetters(s1);
        boolean attempt2 = b.compareAmountOfXAndOLetters(s2);
        boolean attempt3 = b.compareAmountOfXAndOLetters(s3);
        boolean attempt4 = b.compareAmountOfXAndOLetters(s4);
        boolean attempt5 = b.compareAmountOfXAndOLetters(s5);
        boolean attempt6 = b.compareAmountOfXAndOLetters(s6);
        boolean attempt7 = b.compareAmountOfXAndOLetters(s7);
        boolean attempt8 = b.compareAmountOfXAndOLetters(s8);
        boolean attempt9 = b.compareAmountOfXAndOLetters(s9);

        //then
        Assert.assertTrue(attempt1);
        Assert.assertFalse(attempt2);
        Assert.assertTrue(attempt3);
        Assert.assertTrue(attempt4);
        Assert.assertFalse(attempt5);
        Assert.assertFalse(attempt6);
        Assert.assertTrue(attempt7);
        Assert.assertTrue(attempt8);
        Assert.assertTrue(attempt9);
    }
}
