package mumbled_letters;

import org.junit.Assert;
import org.junit.Test;

import static mumbled_letters.MumbledLetters.accum;
import static mumbled_letters.MumbledLettersShorterVer.accumShorterVer;
import static mumbled_letters.MumbledLettersWithStringBuilder.accumStringBuild;

public class MumbledLettersTestSuite {
    @Test
    public void testAccum() {
        // given
        String n = "AbCd";

        // when
        String result = accum(n);

        // then
        Assert.assertEquals("A-Bb-Ccc-Dddd", result);
    }

    @Test
    public void testAccumShorterVer() {
        // given
        String n = "xYZv";

        // when
        String result = accumShorterVer(n);

        // then
        Assert.assertEquals("X-Yy-Zzz-Vvvv", result);
    }

    @Test
    public void testAccumStringBuild() {
        // given
        String n = "oPqRsT";

        // when
        String results = accumStringBuild(n);
    }
}
