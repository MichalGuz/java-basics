package mumbled_letters;

import org.junit.Test;

import static mumbled_letters.MumbledLetters.accum;

public class MumbledLettersTestSuite {
    @Test
    public void testAccum() {
        // given
        String n = "AbCd";

        // when
        accum(n);
    }
}
